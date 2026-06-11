// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobExecutorsResponseBody extends TeaModel {
    /**
     * <p>The list of executors.</p>
     */
    @NameInMap("exexutors")
    public java.util.List<ListJobExecutorsResponseBodyExexutors> exexutors;

    /**
     * <p>The maximum number of records returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListJobExecutorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutorsResponseBody self = new ListJobExecutorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobExecutorsResponseBody setExexutors(java.util.List<ListJobExecutorsResponseBodyExexutors> exexutors) {
        this.exexutors = exexutors;
        return this;
    }
    public java.util.List<ListJobExecutorsResponseBodyExexutors> getExexutors() {
        return this.exexutors;
    }

    public ListJobExecutorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJobExecutorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJobExecutorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobExecutorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobExecutorsResponseBodyExexutors extends TeaModel {
        /**
         * <p>The total number of active tasks that the executor is running.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("activeTasks")
        public Long activeTasks;

        /**
         * <p>The time when the executor was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1760601***</p>
         */
        @NameInMap("addTime")
        public Long addTime;

        /**
         * <p>The total number of completed tasks that the executor has run.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("completedTasks")
        public Long completedTasks;

        /**
         * <p>The disk usage of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("diskUsed")
        public Long diskUsed;

        /**
         * <p>The job executor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("executorId")
        public String executorId;

        /**
         * <p>The executor type.</p>
         * 
         * <strong>example:</strong>
         * <p>driver</p>
         */
        @NameInMap("executorType")
        public String executorType;

        /**
         * <p>The total number of failed tasks that the executor has run.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("failedTasks")
        public Long failedTasks;

        /**
         * <p>The address of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>21.10.x.x:1201x</p>
         */
        @NameInMap("hostPort")
        public String hostPort;

        /**
         * <p>The job run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-1fe145df8ade366a</p>
         */
        @NameInMap("jobRunId")
        public String jobRunId;

        /**
         * <p>The maximum memory of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>4294967296</p>
         */
        @NameInMap("maxMemory")
        public Long maxMemory;

        /**
         * <p>The memory usage of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("memoryUsed")
        public Long memoryUsed;

        /**
         * <p>The number of Resilient Distributed Dataset (RDD) blocks managed by the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("rddBlocks")
        public Long rddBlocks;

        /**
         * <p>The running status of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The total number of cores for the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("totalCores")
        public Long totalCores;

        /**
         * <p>The total runtime of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("totalDuration")
        public Long totalDuration;

        /**
         * <p>The total garbage collection (GC) time of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("totalGCTime")
        public Long totalGCTime;

        /**
         * <p>The number of bytes of input data for the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("totalInputBytes")
        public Long totalInputBytes;

        /**
         * <p>The number of bytes read during the shuffle phase by the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("totalShuffleRead")
        public Long totalShuffleRead;

        /**
         * <p>The number of bytes written during the shuffle phase by the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("totalShuffleWrite")
        public Long totalShuffleWrite;

        /**
         * <p>The total number of tasks that the executor has run.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("totalTasks")
        public Long totalTasks;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-78faee4da118f02e</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListJobExecutorsResponseBodyExexutors build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutorsResponseBodyExexutors self = new ListJobExecutorsResponseBodyExexutors();
            return TeaModel.build(map, self);
        }

        public ListJobExecutorsResponseBodyExexutors setActiveTasks(Long activeTasks) {
            this.activeTasks = activeTasks;
            return this;
        }
        public Long getActiveTasks() {
            return this.activeTasks;
        }

        public ListJobExecutorsResponseBodyExexutors setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public ListJobExecutorsResponseBodyExexutors setCompletedTasks(Long completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Long getCompletedTasks() {
            return this.completedTasks;
        }

        public ListJobExecutorsResponseBodyExexutors setDiskUsed(Long diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }
        public Long getDiskUsed() {
            return this.diskUsed;
        }

        public ListJobExecutorsResponseBodyExexutors setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public ListJobExecutorsResponseBodyExexutors setExecutorType(String executorType) {
            this.executorType = executorType;
            return this;
        }
        public String getExecutorType() {
            return this.executorType;
        }

        public ListJobExecutorsResponseBodyExexutors setFailedTasks(Long failedTasks) {
            this.failedTasks = failedTasks;
            return this;
        }
        public Long getFailedTasks() {
            return this.failedTasks;
        }

        public ListJobExecutorsResponseBodyExexutors setHostPort(String hostPort) {
            this.hostPort = hostPort;
            return this;
        }
        public String getHostPort() {
            return this.hostPort;
        }

        public ListJobExecutorsResponseBodyExexutors setJobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            return this;
        }
        public String getJobRunId() {
            return this.jobRunId;
        }

        public ListJobExecutorsResponseBodyExexutors setMaxMemory(Long maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Long getMaxMemory() {
            return this.maxMemory;
        }

        public ListJobExecutorsResponseBodyExexutors setMemoryUsed(Long memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }
        public Long getMemoryUsed() {
            return this.memoryUsed;
        }

        public ListJobExecutorsResponseBodyExexutors setRddBlocks(Long rddBlocks) {
            this.rddBlocks = rddBlocks;
            return this;
        }
        public Long getRddBlocks() {
            return this.rddBlocks;
        }

        public ListJobExecutorsResponseBodyExexutors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobExecutorsResponseBodyExexutors setTotalCores(Long totalCores) {
            this.totalCores = totalCores;
            return this;
        }
        public Long getTotalCores() {
            return this.totalCores;
        }

        public ListJobExecutorsResponseBodyExexutors setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ListJobExecutorsResponseBodyExexutors setTotalGCTime(Long totalGCTime) {
            this.totalGCTime = totalGCTime;
            return this;
        }
        public Long getTotalGCTime() {
            return this.totalGCTime;
        }

        public ListJobExecutorsResponseBodyExexutors setTotalInputBytes(Long totalInputBytes) {
            this.totalInputBytes = totalInputBytes;
            return this;
        }
        public Long getTotalInputBytes() {
            return this.totalInputBytes;
        }

        public ListJobExecutorsResponseBodyExexutors setTotalShuffleRead(Long totalShuffleRead) {
            this.totalShuffleRead = totalShuffleRead;
            return this;
        }
        public Long getTotalShuffleRead() {
            return this.totalShuffleRead;
        }

        public ListJobExecutorsResponseBodyExexutors setTotalShuffleWrite(Long totalShuffleWrite) {
            this.totalShuffleWrite = totalShuffleWrite;
            return this;
        }
        public Long getTotalShuffleWrite() {
            return this.totalShuffleWrite;
        }

        public ListJobExecutorsResponseBodyExexutors setTotalTasks(Long totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Long getTotalTasks() {
            return this.totalTasks;
        }

        public ListJobExecutorsResponseBodyExexutors setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
