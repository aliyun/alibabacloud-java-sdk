// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOnlineDDLProgressResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("OnlineDDLTaskDetail")
    public GetOnlineDDLProgressResponseBodyOnlineDDLTaskDetail onlineDDLTaskDetail;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CleanStrategy")
        public String cleanStrategy;

        @NameInMap("CopyChunkMode")
        public String copyChunkMode;

        @NameInMap("CopyChunkSize")
        public Long copyChunkSize;

        @NameInMap("CopyCount")
        public Long copyCount;

        @NameInMap("CopyTotal")
        public Long copyTotal;

        @NameInMap("CutoverFailRetryTimes")
        public Long cutoverFailRetryTimes;

        @NameInMap("CutoverLockTimeSeconds")
        public Long cutoverLockTimeSeconds;

        @NameInMap("CutoverWindowEndTime")
        public String cutoverWindowEndTime;

        @NameInMap("CutoverWindowStartTime")
        public String cutoverWindowStartTime;

        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("ProgressRatio")
        public String progressRatio;

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
