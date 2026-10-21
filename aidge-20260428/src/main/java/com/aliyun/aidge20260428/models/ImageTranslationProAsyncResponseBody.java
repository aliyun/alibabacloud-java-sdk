// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationProAsyncResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of success indicates that the task is submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submission result of the Image Translation Pro asynchronous task.</p>
     */
    @NameInMap("Data")
    public ImageTranslationProAsyncResponseBodyData data;

    /**
     * <p>The call description. A value of Success indicates a successful call. If the call fails, read the actual error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the submission request. This ID is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the submission call is successful. This does not indicate that the translation is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageTranslationProAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationProAsyncResponseBody self = new ImageTranslationProAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageTranslationProAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageTranslationProAsyncResponseBody setData(ImageTranslationProAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageTranslationProAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImageTranslationProAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageTranslationProAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageTranslationProAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageTranslationProAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task. This ID is used to query results and associate notifications. Do not use the example prefix as a business validation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageTranslationProAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProAsyncResponseBodyData self = new ImageTranslationProAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
