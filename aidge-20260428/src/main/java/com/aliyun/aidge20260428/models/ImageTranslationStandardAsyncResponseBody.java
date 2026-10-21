// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationStandardAsyncResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned for normal calls.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous task submission result of Image Translation Standard Edition.</p>
     */
    @NameInMap("Data")
    public ImageTranslationStandardAsyncResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned for normal calls.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
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

    public static ImageTranslationStandardAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationStandardAsyncResponseBody self = new ImageTranslationStandardAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageTranslationStandardAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageTranslationStandardAsyncResponseBody setData(ImageTranslationStandardAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageTranslationStandardAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImageTranslationStandardAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageTranslationStandardAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageTranslationStandardAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageTranslationStandardAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The task ID used to query the asynchronous task result.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageTranslationStandardAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardAsyncResponseBodyData self = new ImageTranslationStandardAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
