// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DiduiAreaDeductionProResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submit status of the asynchronous task.</p>
     */
    @NameInMap("Data")
    public DiduiAreaDeductionProResponseBodyData data;

    /**
     * <p>The response message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Task submitted</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DiduiAreaDeductionProResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiduiAreaDeductionProResponseBody self = new DiduiAreaDeductionProResponseBody();
        return TeaModel.build(map, self);
    }

    public DiduiAreaDeductionProResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DiduiAreaDeductionProResponseBody setData(DiduiAreaDeductionProResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DiduiAreaDeductionProResponseBodyData getData() {
        return this.data;
    }

    public DiduiAreaDeductionProResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DiduiAreaDeductionProResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiduiAreaDeductionProResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DiduiAreaDeductionProResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task, which is used to call QueryAsyncTaskResult to query the task result.</p>
         * 
         * <strong>example:</strong>
         * <p>task_778xxxxxxxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DiduiAreaDeductionProResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DiduiAreaDeductionProResponseBodyData self = new DiduiAreaDeductionProResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DiduiAreaDeductionProResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
