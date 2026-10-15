// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateAsyncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TextTranslateAsyncResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
