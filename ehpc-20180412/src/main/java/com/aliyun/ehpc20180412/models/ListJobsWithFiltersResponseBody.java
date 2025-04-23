// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsWithFiltersResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListJobsWithFiltersResponseBodyJobs> jobs;

    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The number of CPUs that were used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Long cores;

        /**
         * <p>The number of nodes that were used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The job array. If the job is not in a queue, the output is empty.</p>
         * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
         * 
         * <strong>example:</strong>
         * <p>1-10:2</p>
         */
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>jobDescription</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8.scheduler</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the job was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1647428667</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>job1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of compute nodes that were used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;compute2\&quot;, \&quot;compute3\&quot;]</p>
         */
        @NameInMap("NodeList")
        public String nodeList;

        /**
         * <p>The name of the user that ran the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test2@scheduler</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the job. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The number of queues that ran the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>Indicates whether the job can be run again. Valid values:</p>
         * <ul>
         * <li>true: yes</li>
         * <li>false: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Rerunable")
        public Boolean rerunable;

        /**
         * <p>The resources that were used to run the job.</p>
         */
        @NameInMap("Resources")
        public ListJobsWithFiltersResponseBodyJobsResources resources;

        /**
         * <p>The path that was used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>./Temp</p>
         */
        @NameInMap("ShellPath")
        public String shellPath;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1647427667</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the job. Valid value:</p>
         * <ul>
         * <li>FINISHED: The job is completed.</li>
         * <li>RUNNING: The job is running.</li>
         * <li>QUEUED: The job is pending in a queue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The output file path of stderr.</p>
         * 
         * <strong>example:</strong>
         * <p>./Temp</p>
         */
        @NameInMap("Stderr")
        public String stderr;

        /**
         * <p>The output file path of stdout.</p>
         * 
         * <strong>example:</strong>
         * <p>./Temp</p>
         */
        @NameInMap("Stdout")
        public String stdout;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1647423718</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The list of variables of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PBS_O_SHELL&quot;:&quot;/bin/bash&quot;, 	&quot;PBS_O_HOST&quot;:&quot;manager&quot;, 	&quot;PBS_O_SYSTEM&quot;:&quot;Linux&quot;, 	&quot;PBS_O_LANG&quot;:&quot;en_US.UTF-8&quot;, 	&quot;PBS_O_QUEUE&quot;:&quot;workq&quot;}</p>
         */
        @NameInMap("VariableList")
        public String variableList;

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

        public ListJobsWithFiltersResponseBodyJobs setRerunable(Boolean rerunable) {
            this.rerunable = rerunable;
            return this;
        }
        public Boolean getRerunable() {
            return this.rerunable;
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

        public ListJobsWithFiltersResponseBodyJobs setVariableList(String variableList) {
            this.variableList = variableList;
            return this;
        }
        public String getVariableList() {
            return this.variableList;
        }

    }

}
