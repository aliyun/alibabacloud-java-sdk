// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Jobs")
    public java.util.List<ListJobsResponseBodyJobs> jobs;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsResponseBody setJobs(java.util.List<ListJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public static class ListJobsResponseBodyJobsResources extends TeaModel {
        @NameInMap("Nodes")
        public Integer nodes;

        @NameInMap("Cores")
        public Integer cores;

        public static ListJobsResponseBodyJobsResources build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsResources self = new ListJobsResponseBodyJobsResources();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsResources setNodes(Integer nodes) {
            this.nodes = nodes;
            return this;
        }
        public Integer getNodes() {
            return this.nodes;
        }

        public ListJobsResponseBodyJobsResources setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("Stderr")
        public String stderr;

        @NameInMap("State")
        public String state;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("ShellPath")
        public String shellPath;

        @NameInMap("Stdout")
        public String stdout;

        @NameInMap("ArrayRequest")
        public String arrayRequest;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        @NameInMap("NodeList")
        public String nodeList;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("Resources")
        public ListJobsResponseBodyJobsResources resources;

        public static ListJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobs self = new ListJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobs setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListJobsResponseBodyJobs setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListJobsResponseBodyJobs setStderr(String stderr) {
            this.stderr = stderr;
            return this;
        }
        public String getStderr() {
            return this.stderr;
        }

        public ListJobsResponseBodyJobs setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobsResponseBodyJobs setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListJobsResponseBodyJobs setShellPath(String shellPath) {
            this.shellPath = shellPath;
            return this;
        }
        public String getShellPath() {
            return this.shellPath;
        }

        public ListJobsResponseBodyJobs setStdout(String stdout) {
            this.stdout = stdout;
            return this;
        }
        public String getStdout() {
            return this.stdout;
        }

        public ListJobsResponseBodyJobs setArrayRequest(String arrayRequest) {
            this.arrayRequest = arrayRequest;
            return this;
        }
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        public ListJobsResponseBodyJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobsResponseBodyJobs setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListJobsResponseBodyJobs setNodeList(String nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public String getNodeList() {
            return this.nodeList;
        }

        public ListJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobsResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListJobsResponseBodyJobs setResources(ListJobsResponseBodyJobsResources resources) {
            this.resources = resources;
            return this;
        }
        public ListJobsResponseBodyJobsResources getResources() {
            return this.resources;
        }

    }

}
