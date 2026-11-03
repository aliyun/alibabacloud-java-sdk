// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRecognitionAsyncResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned for normal calls.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned struct information of the result.</p>
     */
    @NameInMap("Data")
    public ImageRecognitionAsyncResponseBodyData data;

    /**
     * <p>The error message, such as The parameter contains sensitive information. Try another input.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. It is used to identify a unique request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true: Successful. false: Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageRecognitionAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageRecognitionAsyncResponseBody self = new ImageRecognitionAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageRecognitionAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageRecognitionAsyncResponseBody setData(ImageRecognitionAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageRecognitionAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImageRecognitionAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageRecognitionAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageRecognitionAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageRecognitionAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the task. It is used to query the result of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageRecognitionAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageRecognitionAsyncResponseBodyData self = new ImageRecognitionAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageRecognitionAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
