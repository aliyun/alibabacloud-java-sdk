// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class CheckTuringTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CheckTuringTaskResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("failCode")
        public String failCode;

        @NameInMap("failMsg")
        public String failMsg;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>871509423398305792</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://order-45-1318180738.cos.ap-beijing.myqcloud.com/2025/06/09/1a4837f81c594e7790073f22a43439bf.mp4">http://order-45-1318180738.cos.ap-beijing.myqcloud.com/2025/06/09/1a4837f81c594e7790073f22a43439bf.mp4</a></p>
         */
        @NameInMap("videoUrl")
        public String videoUrl;

        public static CheckTuringTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckTuringTaskResponseBodyResult self = new CheckTuringTaskResponseBodyResult();
            return TeaModel.build(map, self);
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
