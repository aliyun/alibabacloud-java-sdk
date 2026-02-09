// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class SubmitTuringTaskResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>551FF252-6CFC-5DDA-9F84-9B07302385C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public SubmitTuringTaskResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitTuringTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTuringTaskResponseBody self = new SubmitTuringTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTuringTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitTuringTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SubmitTuringTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTuringTaskResponseBody setResult(SubmitTuringTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SubmitTuringTaskResponseBodyResult getResult() {
        return this.result;
    }

    public SubmitTuringTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitTuringTaskResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>874890065171169280</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitTuringTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitTuringTaskResponseBodyResult self = new SubmitTuringTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SubmitTuringTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
