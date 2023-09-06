// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("Jobs")
    public ListJobsResponseBodyJobs jobs;

    /**
     * <p>The page number returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
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
        /**
         * <p>The number of CPUs that were used to run the job.</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The number of nodes that were used to run the job.</p>
         */
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
        /**
         * <p>The job array. If the job is not in a queue, the output is empty.</p>
         * <br>
         * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
         */
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        /**
         * <p>The description of the job.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The job ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the job was last modified.</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The name of the job.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of compute nodes that were used to run the job.</p>
         */
        @NameInMap("NodeList")
        public String nodeList;

        /**
         * <p>The name of the user that ran the job.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the job. Valid values: 0 to 9. A large value indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The resources that were used to run the job.</p>
         */
        @NameInMap("Resources")
        public ListJobsResponseBodyJobsJobInfoResources resources;

        /**
         * <p>The path that was used to run the job.</p>
         */
        @NameInMap("ShellPath")
        public String shellPath;

        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   FINISHED: The job is completed</p>
         * <p>*   RUNNING: The job connector is running.</p>
         * <p>*   QUEUED: The job is pending in a queue.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The output file path of stderr.</p>
         */
        @NameInMap("Stderr")
        public String stderr;

        /**
         * <p>The output file path of stdout.</p>
         */
        @NameInMap("Stdout")
        public String stdout;

        /**
         * <p>The time when the job was submitted.</p>
         */
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
