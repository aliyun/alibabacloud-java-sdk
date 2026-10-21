// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationPlusAsyncResponseBody extends TeaModel {
    /**
     * <p>The response code for the submission call. A successful call returns success.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submission result of the asynchronous task for the Plus edition of image translation.</p>
     */
    @NameInMap("Data")
    public ImageTranslationPlusAsyncResponseBodyData data;

    /**
     * <p>The error message, such as \&quot;The content contains sensitive data. Try another input.\&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which is used for troubleshooting and tracing analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the submission call is successful. This does not indicate that the translation is complete. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageTranslationPlusAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationPlusAsyncResponseBody self = new ImageTranslationPlusAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageTranslationPlusAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageTranslationPlusAsyncResponseBody setData(ImageTranslationPlusAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageTranslationPlusAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImageTranslationPlusAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageTranslationPlusAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageTranslationPlusAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageTranslationPlusAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The identifier of the asynchronous task, which is used for result queries and notification association. Do not use the example prefix as a business validation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageTranslationPlusAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationPlusAsyncResponseBodyData self = new ImageTranslationPlusAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageTranslationPlusAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
