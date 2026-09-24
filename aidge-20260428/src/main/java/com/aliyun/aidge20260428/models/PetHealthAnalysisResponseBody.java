// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PetHealthAnalysisResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
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
    public PetHealthAnalysisResponseBodyData data;

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
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PetHealthAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PetHealthAnalysisResponseBody self = new PetHealthAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public PetHealthAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PetHealthAnalysisResponseBody setData(PetHealthAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PetHealthAnalysisResponseBodyData getData() {
        return this.data;
    }

    public PetHealthAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PetHealthAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PetHealthAnalysisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PetHealthAnalysisResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID used for QueryAsyncTaskResult queries.</p>
         * 
         * <strong>example:</strong>
         * <p>task_778fa8bd21804828a5d147050e30edac</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static PetHealthAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PetHealthAnalysisResponseBodyData self = new PetHealthAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PetHealthAnalysisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
