// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class EcomVideoRecreationResponseBody extends TeaModel {
    /**
     * <p>The result code. <code>success</code> indicates success. An error code is returned upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous task submit status.</p>
     */
    @NameInMap("Data")
    public EcomVideoRecreationResponseBodyData data;

    /**
     * <p>The response message. An error description is returned upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Task submitted</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, used to identify a unique call.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the submission is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EcomVideoRecreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EcomVideoRecreationResponseBody self = new EcomVideoRecreationResponseBody();
        return TeaModel.build(map, self);
    }

    public EcomVideoRecreationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EcomVideoRecreationResponseBody setData(EcomVideoRecreationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EcomVideoRecreationResponseBodyData getData() {
        return this.data;
    }

    public EcomVideoRecreationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EcomVideoRecreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EcomVideoRecreationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EcomVideoRecreationResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID for QueryAsyncTaskResult queries.</p>
         * 
         * <strong>example:</strong>
         * <p>task_778fa8bd21804828a5d147050e30edac</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static EcomVideoRecreationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EcomVideoRecreationResponseBodyData self = new EcomVideoRecreationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EcomVideoRecreationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
