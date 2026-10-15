// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveAsyncResponseBody extends TeaModel {
    /**
     * <p>The status code, such as &quot;success&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result struct.</p>
     */
    @NameInMap("Data")
    public ImageRemoveAsyncResponseBodyData data;

    /**
     * <p>The error message, such as &quot;The parameters contain sensitive information. Please try another input.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to identify a unique request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values: true (success) and false (failure).</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageRemoveAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveAsyncResponseBody self = new ImageRemoveAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageRemoveAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageRemoveAsyncResponseBody setData(ImageRemoveAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageRemoveAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImageRemoveAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageRemoveAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageRemoveAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageRemoveAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The task ID used to query the result of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageRemoveAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageRemoveAsyncResponseBodyData self = new ImageRemoveAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageRemoveAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
