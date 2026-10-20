// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateAsyncResponseBody extends TeaModel {
    /**
     * <p>The response code of the submission call. Example: success.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submission result of the text translation asynchronous node.</p>
     */
    @NameInMap("Data")
    public TextTranslateAsyncResponseBodyData data;

    /**
     * <p>The invocation message. Example of a successful call: Success. If the call fails, check the actual error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the submission request. It is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the submission call is successful. A successful call does not mean that the translation is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TextTranslateAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateAsyncResponseBody self = new TextTranslateAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public TextTranslateAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TextTranslateAsyncResponseBody setData(TextTranslateAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TextTranslateAsyncResponseBodyData getData() {
        return this.data;
    }

    public TextTranslateAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextTranslateAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextTranslateAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TextTranslateAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task. It is used for result queries and notification association. Do not use the example prefix as a business validation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static TextTranslateAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateAsyncResponseBodyData self = new TextTranslateAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextTranslateAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
