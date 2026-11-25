// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GeneralImageGenerationResponseBody extends TeaModel {
    /**
     * <p>The status code, such as success.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous task submission result.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Data")
    public GeneralImageGenerationResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned for normal calls.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. It is used to identify a unique request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GeneralImageGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneralImageGenerationResponseBody self = new GeneralImageGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneralImageGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GeneralImageGenerationResponseBody setData(GeneralImageGenerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneralImageGenerationResponseBodyData getData() {
        return this.data;
    }

    public GeneralImageGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GeneralImageGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneralImageGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GeneralImageGenerationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task used to query the result by calling QueryAsyncTaskResult.</p>
         * 
         * <strong>example:</strong>
         * <p>task_778fa8bd21804828a5d147050e30edac</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GeneralImageGenerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneralImageGenerationResponseBodyData self = new GeneralImageGenerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneralImageGenerationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
