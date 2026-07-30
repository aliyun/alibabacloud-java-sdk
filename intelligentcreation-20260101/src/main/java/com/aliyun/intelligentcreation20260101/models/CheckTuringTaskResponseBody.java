// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class CheckTuringTaskResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CheckTuringTaskResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CheckTuringTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckTuringTaskResponseBody self = new CheckTuringTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckTuringTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckTuringTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CheckTuringTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckTuringTaskResponseBody setResult(CheckTuringTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckTuringTaskResponseBodyResult getResult() {
        return this.result;
    }

    public CheckTuringTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckTuringTaskResponseBodyResult extends TeaModel {
        @NameInMap("failBizCode")
        public String failBizCode;

        @NameInMap("failCode")
        public String failCode;

        @NameInMap("failMsg")
        public String failMsg;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("videoUrl")
        public String videoUrl;

        public static CheckTuringTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckTuringTaskResponseBodyResult self = new CheckTuringTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckTuringTaskResponseBodyResult setFailBizCode(String failBizCode) {
            this.failBizCode = failBizCode;
            return this;
        }
        public String getFailBizCode() {
            return this.failBizCode;
        }

        public CheckTuringTaskResponseBodyResult setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public CheckTuringTaskResponseBodyResult setFailMsg(String failMsg) {
            this.failMsg = failMsg;
            return this;
        }
        public String getFailMsg() {
            return this.failMsg;
        }

        public CheckTuringTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CheckTuringTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CheckTuringTaskResponseBodyResult setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
