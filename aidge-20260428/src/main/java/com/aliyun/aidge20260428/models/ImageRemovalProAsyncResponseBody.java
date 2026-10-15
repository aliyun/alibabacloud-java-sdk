// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemovalProAsyncResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned when the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submission result of the Intelligent Erasure Pro asynchronous task.</p>
     */
    @NameInMap("Data")
    public ImageRemovalProAsyncResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned when the call is successful. Example: &quot;The parameters contain sensitive information. Try other inputs.&quot;</p>
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
     * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageRemovalProAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageRemovalProAsyncResponseBody self = new ImageRemovalProAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageRemovalProAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageRemovalProAsyncResponseBody setData(ImageRemovalProAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageRemovalProAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImageRemovalProAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageRemovalProAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageRemovalProAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageRemovalProAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The node ID used to query the asynchronous task result.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageRemovalProAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageRemovalProAsyncResponseBodyData self = new ImageRemovalProAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageRemovalProAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
