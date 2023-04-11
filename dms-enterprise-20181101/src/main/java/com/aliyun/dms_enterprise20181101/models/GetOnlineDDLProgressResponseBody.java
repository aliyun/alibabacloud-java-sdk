// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOnlineDDLProgressResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("OnlineDDLTaskDetail")
    public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail onlineDDLTaskDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOnlineDDLProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineDDLProgressResponseBody self = new GetOnlineDDLProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnlineDDLProgressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOnlineDDLProgressResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOnlineDDLProgressResponseBody setOnlineDDLTaskDetail(GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail onlineDDLTaskDetail) {
        this.onlineDDLTaskDetail = onlineDDLTaskDetail;
        return this;
    }
    public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail getOnlineDDLTaskDetail() {
        return this.onlineDDLTaskDetail;
    }

    public GetOnlineDDLProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnlineDDLProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail extends TeaModel {
        /**
         * <p>The cleanup policy of the original table after the cut-over. Valid values:</p>
         * <br>
         * <p>*   **DROP**: Invalid original tables are deleted.</p>
         * <p>*   **MOVE**: Invalid original tables are moved to the test database. You can delete the tables manually.</p>
         * <p>*   **NOTHING**: Invalid original tables are retained in the original database. You can delete the tables manually.</p>
         */
        @NameInMap("CleanStrategy")
        public String cleanStrategy;

        /**
         * <p>The policy of full replication. Valid values:</p>
         * <br>
         * <p>*   **AUTO**: DMS dynamically adjusts the chunk size based on the performance of the database. Tables are locked for less than 1.5 seconds during a single replication operation.</p>
         * <p>*   **RUNNING**: DMS uses the specified value of the CopyChunkSize parameter. The valid value of the CopyChunkSize parameter ranges from 1 to 60000. If you set this parameter to RUNNING, you must specify the CopyChunkSize parameter.</p>
         */
        @NameInMap("CopyChunkMode")
        public String copyChunkMode;

        /**
         * <p>The size of each chunk that is used to replicate data. This parameter is used to specify the size of each chunk. A larger chunk size increases the replication efficiency and decreases the business performance.</p>
         * <br>
         * <p>> During full replication, the original table is divided into N small chunks and each chunk is replicated to the temporary table one by one. By default, DMS dynamically adjusts the size of each chunk.</p>
         */
        @NameInMap("CopyChunkSize")
        public Long copyChunkSize;

        /**
         * <p>The actual amount of data replicated from the original table in the lock-free change operation.</p>
         */
        @NameInMap("CopyCount")
        public Long copyCount;

        /**
         * <p>The estimated total number of rows of the data. The value is obtained from the statistical data in the information_schema database. In most cases, the estimated total number of rows is smaller than the actual number of rows in a table.</p>
         */
        @NameInMap("CopyTotal")
        public Long copyTotal;

        /**
         * <p>The number of retries when the cut-over fails.</p>
         */
        @NameInMap("CutoverFailRetryTimes")
        public Long cutoverFailRetryTimes;

        /**
         * <p>The maximum period of time that a table can be locked during cut-over. Unit: seconds.</p>
         */
        @NameInMap("CutoverLockTimeSeconds")
        public Long cutoverLockTimeSeconds;

        /**
         * <p>The end of the time window of the cut-over operation. This value is at least 30 minutes later than the CutoverWindowStartTime parameter. Default value: 23:59:59</p>
         */
        @NameInMap("CutoverWindowEndTime")
        public String cutoverWindowEndTime;

        /**
         * <p>The beginning of the time window of the cut-over operation. Default value: 00:00:00. This parameter controls the time window of the cut-over. Cut-over can be performed only when the cut-over conditions are met and the time is within the specified time window. If the time is not within the time window, the cut-over operation is not performed until the time reaches the beginning of the time window.</p>
         */
        @NameInMap("CutoverWindowStartTime")
        public String cutoverWindowStartTime;

        /**
         * <p>The replay latency of DMS. Unit: seconds. The replay latency is the period of time that is taken to replay the binary logs of the table to the temporary table. The latency does not indicate the data migration latency between a primary database and a secondary database.</p>
         */
        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        /**
         * <p>The state of the task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **SUCCESS**: The task is complete.</p>
         * <p>*   **RUNNING**: The task is being executed.</p>
         * <p>*   **WAITING_CUTOVER**: The task is waiting for cut-over.</p>
         * <p>*   **RESTARTING**: The task is restarting.</p>
         * <p>*   **PAUSE**: The task is suspended.</p>
         * <p>*   **UNSUPPORTED**: The task is not supported.</p>
         * <p>*   **CANCELED**: The task is canceled.</p>
         * <p>*   **FAIL**: The task failed.</p>
         * <p>*   **INTERRUPT**: The task is interrupted.</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The estimated execution progress. The actual progress is subject to the task status.</p>
         */
        @NameInMap("ProgressRatio")
        public String progressRatio;

        /**
         * <p>The description of the task status.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail self = new GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail();
            return TeaModel.build(map, self);
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCleanStrategy(String cleanStrategy) {
            this.cleanStrategy = cleanStrategy;
            return this;
        }
        public String getCleanStrategy() {
            return this.cleanStrategy;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCopyChunkMode(String copyChunkMode) {
            this.copyChunkMode = copyChunkMode;
            return this;
        }
        public String getCopyChunkMode() {
            return this.copyChunkMode;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCopyChunkSize(Long copyChunkSize) {
            this.copyChunkSize = copyChunkSize;
            return this;
        }
        public Long getCopyChunkSize() {
            return this.copyChunkSize;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCopyCount(Long copyCount) {
            this.copyCount = copyCount;
            return this;
        }
        public Long getCopyCount() {
            return this.copyCount;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCopyTotal(Long copyTotal) {
            this.copyTotal = copyTotal;
            return this;
        }
        public Long getCopyTotal() {
            return this.copyTotal;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCutoverFailRetryTimes(Long cutoverFailRetryTimes) {
            this.cutoverFailRetryTimes = cutoverFailRetryTimes;
            return this;
        }
        public Long getCutoverFailRetryTimes() {
            return this.cutoverFailRetryTimes;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCutoverLockTimeSeconds(Long cutoverLockTimeSeconds) {
            this.cutoverLockTimeSeconds = cutoverLockTimeSeconds;
            return this;
        }
        public Long getCutoverLockTimeSeconds() {
            return this.cutoverLockTimeSeconds;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCutoverWindowEndTime(String cutoverWindowEndTime) {
            this.cutoverWindowEndTime = cutoverWindowEndTime;
            return this;
        }
        public String getCutoverWindowEndTime() {
            return this.cutoverWindowEndTime;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setCutoverWindowStartTime(String cutoverWindowStartTime) {
            this.cutoverWindowStartTime = cutoverWindowStartTime;
            return this;
        }
        public String getCutoverWindowStartTime() {
            return this.cutoverWindowStartTime;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setDelaySeconds(Long delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Long getDelaySeconds() {
            return this.delaySeconds;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setProgressRatio(String progressRatio) {
            this.progressRatio = progressRatio;
            return this;
        }
        public String getProgressRatio() {
            return this.progressRatio;
        }

        public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

}
