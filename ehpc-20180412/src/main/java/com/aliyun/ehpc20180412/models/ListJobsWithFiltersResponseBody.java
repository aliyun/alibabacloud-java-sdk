// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsWithFiltersResponseBody extends TeaModel {
    // Jobs
    @NameInMap("Jobs")
    public java.util.List<ListJobsWithFiltersResponseBodyJobs> jobs;

    // PageNumber
    @NameInMap("PageNumber")
    public Long pageNumber;

    // PageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobsWithFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsWithFiltersResponseBody self = new ListJobsWithFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsWithFiltersResponseBody setJobs(java.util.List<ListJobsWithFiltersResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListJobsWithFiltersResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListJobsWithFiltersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsWithFiltersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListJobsWithFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsWithFiltersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobsWithFiltersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobsWithFiltersResponseBodyJobsResources extends TeaModel {
        @NameInMap("Cores")
        public Long cores;

        @NameInMap("Nodes")
        public Long nodes;

        public static ListJobsWithFiltersResponseBodyJobsResources build(java.util.Map<String, ?> map) throws Exception {
            ListJobsWithFiltersResponseBodyJobsResources self = new ListJobsWithFiltersResponseBodyJobsResources();
            return TeaModel.build(map, self);
        }

        public ListJobsWithFiltersResponseBodyJobsResources setCores(Long cores) {
            this.cores = cores;
            return this;
        }
        public Long getCores() {
            return this.cores;
        }

        public ListJobsWithFiltersResponseBodyJobsResources setNodes(Long nodes) {
            this.nodes = nodes;
            return this;
        }
        public Long getNodes() {
            return this.nodes;
        }

    }

    public static class ListJobsWithFiltersResponseBodyJobs extends TeaModel {
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeList")
        public String nodeList;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Resources")
        public ListJobsWithFiltersResponseBodyJobsResources resources;

        @NameInMap("ShellPath")
        public String shellPath;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Stderr")
        public String stderr;

        @NameInMap("Stdout")
        public String stdout;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static ListJobsWithFiltersResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsWithFiltersResponseBodyJobs self = new ListJobsWithFiltersResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsWithFiltersResponseBodyJobs setArrayRequest(String arrayRequest) {
            this.arrayRequest = arrayRequest;
            return this;
        }
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        public ListJobsWithFiltersResponseBodyJobs setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListJobsWithFiltersResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobsWithFiltersResponseBodyJobs setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListJobsWithFiltersResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobsWithFiltersResponseBodyJobs setNodeList(String nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public String getNodeList() {
            return this.nodeList;
        }

        public ListJobsWithFiltersResponseBodyJobs setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListJobsWithFiltersResponseBodyJobs setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListJobsWithFiltersResponseBodyJobs setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public ListJobsWithFiltersResponseBodyJobs setResources(ListJobsWithFiltersResponseBodyJobsResources resources) {
            this.resources = resources;
            return this;
        }
        public ListJobsWithFiltersResponseBodyJobsResources getResources() {
            return this.resources;
        }

        public ListJobsWithFiltersResponseBodyJobs setShellPath(String shellPath) {
            this.shellPath = shellPath;
            return this;
        }
        public String getShellPath() {
            return this.shellPath;
        }

        public ListJobsWithFiltersResponseBodyJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobsWithFiltersResponseBodyJobs setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobsWithFiltersResponseBodyJobs setStderr(String stderr) {
            this.stderr = stderr;
            return this;
        }
        public String getStderr() {
            return this.stderr;
        }

        public ListJobsWithFiltersResponseBodyJobs setStdout(String stdout) {
            this.stdout = stdout;
            return this;
        }
        public String getStdout() {
            return this.stdout;
        }

        public ListJobsWithFiltersResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

}
