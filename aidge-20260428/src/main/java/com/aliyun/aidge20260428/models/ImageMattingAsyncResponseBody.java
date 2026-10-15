// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageMattingAsyncResponseBody extends TeaModel {
    /**
     * <p>The status code, such as success.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The commit result of the intelligent image matting asynchronous task node.</p>
     */
    @NameInMap("Data")
    public ImageMattingAsyncResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned when the call is successful.</p>
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
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageMattingAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageMattingAsyncResponseBody self = new ImageMattingAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageMattingAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageMattingAsyncResponseBody setData(ImageMattingAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageMattingAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImageMattingAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageMattingAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageMattingAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageMattingAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the task that is used to query the asynchronous task result.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageMattingAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageMattingAsyncResponseBodyData self = new ImageMattingAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageMattingAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
