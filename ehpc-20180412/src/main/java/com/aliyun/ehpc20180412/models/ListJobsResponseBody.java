// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public ListJobsResponseBodyJobs jobs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setJobs(ListJobsResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public ListJobsResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public ListJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobsResponseBodyJobsJobInfoResources extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("Nodes")
        public Integer nodes;

        public static ListJobsResponseBodyJobsJobInfoResources build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsJobInfoResources self = new ListJobsResponseBodyJobsJobInfoResources();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsJobInfoResources setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public ListJobsResponseBodyJobsJobInfoResources setNodes(Integer nodes) {
            this.nodes = nodes;
            return this;
        }
        public Integer getNodes() {
            return this.nodes;
        }

    }

    public static class ListJobsResponseBodyJobsJobInfo extends TeaModel {
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

        @NameInMap("Resources")
        public ListJobsResponseBodyJobsJobInfoResources resources;

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

        public static ListJobsResponseBodyJobsJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsJobInfo self = new ListJobsResponseBodyJobsJobInfo();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsJobInfo setArrayRequest(String arrayRequest) {
            this.arrayRequest = arrayRequest;
            return this;
        }
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        public ListJobsResponseBodyJobsJobInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListJobsResponseBodyJobsJobInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobsResponseBodyJobsJobInfo setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListJobsResponseBodyJobsJobInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobsResponseBodyJobsJobInfo setNodeList(String nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public String getNodeList() {
            return this.nodeList;
        }

        public ListJobsResponseBodyJobsJobInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListJobsResponseBodyJobsJobInfo setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListJobsResponseBodyJobsJobInfo setResources(ListJobsResponseBodyJobsJobInfoResources resources) {
            this.resources = resources;
            return this;
        }
        public ListJobsResponseBodyJobsJobInfoResources getResources() {
            return this.resources;
        }

        public ListJobsResponseBodyJobsJobInfo setShellPath(String shellPath) {
            this.shellPath = shellPath;
            return this;
        }
        public String getShellPath() {
            return this.shellPath;
        }

        public ListJobsResponseBodyJobsJobInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobsResponseBodyJobsJobInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobsResponseBodyJobsJobInfo setStderr(String stderr) {
            this.stderr = stderr;
            return this;
        }
        public String getStderr() {
            return this.stderr;
        }

        public ListJobsResponseBodyJobsJobInfo setStdout(String stdout) {
            this.stdout = stdout;
            return this;
        }
        public String getStdout() {
            return this.stdout;
        }

        public ListJobsResponseBodyJobsJobInfo setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        @NameInMap("JobInfo")
        public java.util.List<ListJobsResponseBodyJobsJobInfo> jobInfo;

        public static ListJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobs self = new ListJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobs setJobInfo(java.util.List<ListJobsResponseBodyJobsJobInfo> jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsJobInfo> getJobInfo() {
            return this.jobInfo;
        }

    }

}
