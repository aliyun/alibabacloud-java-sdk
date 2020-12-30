// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class GetTaskResultResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetTaskResultResponseBodyResult result;

    public static GetTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultResponseBody self = new GetTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResultResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResultResponseBody setResult(GetTaskResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTaskResultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetTaskResultResponseBodyResult extends TeaModel {
        @NameInMap("ErrorName")
        public String errorName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("VideoName")
        public String videoName;

        @NameInMap("AnalysisUseTime")
        public Long analysisUseTime;

        @NameInMap("ProcessResultUrl")
        public String processResultUrl;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ErrorReason")
        public String errorReason;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetTaskResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyResult self = new GetTaskResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyResult setErrorName(String errorName) {
            this.errorName = errorName;
            return this;
        }
        public String getErrorName() {
            return this.errorName;
        }

        public GetTaskResultResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTaskResultResponseBodyResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTaskResultResponseBodyResult setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public GetTaskResultResponseBodyResult setAnalysisUseTime(Long analysisUseTime) {
            this.analysisUseTime = analysisUseTime;
            return this;
        }
        public Long getAnalysisUseTime() {
            return this.analysisUseTime;
        }

        public GetTaskResultResponseBodyResult setProcessResultUrl(String processResultUrl) {
            this.processResultUrl = processResultUrl;
            return this;
        }
        public String getProcessResultUrl() {
            return this.processResultUrl;
        }

        public GetTaskResultResponseBodyResult setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetTaskResultResponseBodyResult setErrorReason(String errorReason) {
            this.errorReason = errorReason;
            return this;
        }
        public String getErrorReason() {
            return this.errorReason;
        }

        public GetTaskResultResponseBodyResult setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
