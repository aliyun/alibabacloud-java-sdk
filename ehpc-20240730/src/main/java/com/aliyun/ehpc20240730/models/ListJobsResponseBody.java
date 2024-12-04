// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListJobsResponseBodyJobs> jobs;

    /**
     * <p>The page number. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EABFBD93-58BE-53F3-BBFE-8654BB2E****</p>
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
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setJobs(java.util.List<ListJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListJobsResponseBodyJobs> getJobs() {
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

    public ListJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobsResponseBodyJobsJobSpecResources extends TeaModel {
        /**
         * <p>The number of vCPUs that were used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Cores")
        public String cores;

        /**
         * <p>The number of GPUs that were used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gpus")
        public String gpus;

        /**
         * <p>The size of memory that was used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1536MB</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The number of compute nodes that were used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Nodes")
        public String nodes;

        public static ListJobsResponseBodyJobsJobSpecResources build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsJobSpecResources self = new ListJobsResponseBodyJobsJobSpecResources();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsJobSpecResources setCores(String cores) {
            this.cores = cores;
            return this;
        }
        public String getCores() {
            return this.cores;
        }

        public ListJobsResponseBodyJobsJobSpecResources setGpus(String gpus) {
            this.gpus = gpus;
            return this;
        }
        public String getGpus() {
            return this.gpus;
        }

        public ListJobsResponseBodyJobsJobSpecResources setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListJobsResponseBodyJobsJobSpecResources setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

    }

    public static class ListJobsResponseBodyJobsJobSpec extends TeaModel {
        /**
         * <p>The array job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ArrayJobId")
        public String arrayJobId;

        /**
         * <p>The ID of the job in the array.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ArrayJobSubId")
        public String arrayJobSubId;

        /**
         * <p>The queue format of the job.</p>
         * <ul>
         * <li>If the job is not in a queue, the output is empty.</li>
         * <li>The format is X-Y:Z. X indicates the first index, Y indicates the final index, and Z indicates the step size. For example, 2-7:2 indicates three sub-jobs numbered 2, 4, and 6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1-5:2</p>
         */
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        /**
         * <p>The job description.</p>
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
         * <p>12</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>comp</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The time when the job was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1724123085</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The compute nodes that were used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>compute[002,005,003]</p>
         */
        @NameInMap("NodeList")
        public String nodeList;

        /**
         * <p>The job priority. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The information about the resources required to run the job.</p>
         */
        @NameInMap("Resources")
        public ListJobsResponseBodyJobsJobSpecResources resources;

        /**
         * <p>The user that ran the job.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser1</p>
         */
        @NameInMap("RunasUser")
        public String runasUser;

        /**
         * <p>The job state. Valid values: (PBS cluster and Slurm cluster)</p>
         * <ul>
         * <li>FINISHED/Completed</li>
         * <li>RUNNING/Running</li>
         * <li>QUEUED/Pending</li>
         * <li>FAILED/Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The error output path.</p>
         * 
         * <strong>example:</strong>
         * <p>./Temp</p>
         */
        @NameInMap("StderrPath")
        public String stderrPath;

        /**
         * <p>The standard output path.</p>
         * 
         * <strong>example:</strong>
         * <p>./Temp</p>
         */
        @NameInMap("StdoutPath")
        public String stdoutPath;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1724122486</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The variables of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PBS_O_SHELL&quot;:&quot;/bin/bash&quot;, 	&quot;PBS_O_HOST&quot;:&quot;manager&quot;, 	&quot;PBS_O_SYSTEM&quot;:&quot;Linux&quot;, 	&quot;PBS_O_LANG&quot;:&quot;en_US.UTF-8&quot;, 	&quot;PBS_O_QUEUE&quot;:&quot;workq&quot;}</p>
         */
        @NameInMap("Variables")
        public String variables;

        public static ListJobsResponseBodyJobsJobSpec build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsJobSpec self = new ListJobsResponseBodyJobsJobSpec();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsJobSpec setArrayJobId(String arrayJobId) {
            this.arrayJobId = arrayJobId;
            return this;
        }
        public String getArrayJobId() {
            return this.arrayJobId;
        }

        public ListJobsResponseBodyJobsJobSpec setArrayJobSubId(String arrayJobSubId) {
            this.arrayJobSubId = arrayJobSubId;
            return this;
        }
        public String getArrayJobSubId() {
            return this.arrayJobSubId;
        }

        public ListJobsResponseBodyJobsJobSpec setArrayRequest(String arrayRequest) {
            this.arrayRequest = arrayRequest;
            return this;
        }
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        public ListJobsResponseBodyJobsJobSpec setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListJobsResponseBodyJobsJobSpec setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobsResponseBodyJobsJobSpec setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public ListJobsResponseBodyJobsJobSpec setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListJobsResponseBodyJobsJobSpec setNodeList(String nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public String getNodeList() {
            return this.nodeList;
        }

        public ListJobsResponseBodyJobsJobSpec setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListJobsResponseBodyJobsJobSpec setResources(ListJobsResponseBodyJobsJobSpecResources resources) {
            this.resources = resources;
            return this;
        }
        public ListJobsResponseBodyJobsJobSpecResources getResources() {
            return this.resources;
        }

        public ListJobsResponseBodyJobsJobSpec setRunasUser(String runasUser) {
            this.runasUser = runasUser;
            return this;
        }
        public String getRunasUser() {
            return this.runasUser;
        }

        public ListJobsResponseBodyJobsJobSpec setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobsResponseBodyJobsJobSpec setStderrPath(String stderrPath) {
            this.stderrPath = stderrPath;
            return this;
        }
        public String getStderrPath() {
            return this.stderrPath;
        }

        public ListJobsResponseBodyJobsJobSpec setStdoutPath(String stdoutPath) {
            this.stdoutPath = stdoutPath;
            return this;
        }
        public String getStdoutPath() {
            return this.stdoutPath;
        }

        public ListJobsResponseBodyJobsJobSpec setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListJobsResponseBodyJobsJobSpec setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>testjob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The job configurations.</p>
         */
        @NameInMap("JobSpec")
        public ListJobsResponseBodyJobsJobSpec jobSpec;

        public static ListJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobs self = new ListJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobsResponseBodyJobs setJobSpec(ListJobsResponseBodyJobsJobSpec jobSpec) {
            this.jobSpec = jobSpec;
            return this;
        }
        public ListJobsResponseBodyJobsJobSpec getJobSpec() {
            return this.jobSpec;
        }

    }

}
