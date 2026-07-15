// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemovalProResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The intelligent removal Pro result.</p>
     */
    @NameInMap("Data")
    public ImageRemovalProResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
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
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageRemovalProResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageRemovalProResponseBody self = new ImageRemovalProResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageRemovalProResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageRemovalProResponseBody setData(ImageRemovalProResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageRemovalProResponseBodyData getData() {
        return this.data;
    }

    public ImageRemovalProResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageRemovalProResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageRemovalProResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageRemovalProResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the result image. This parameter is returned in synchronous mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aib-image.oss-ap-southeast-1.aliyuncs.com/ai_desc%2F250cc947-9cd5-4df0-9c23-44eba5d0dfc30.jpg?OSSAccessKeyId=LTAI5tSEGjGp5wixZgHLc3bV&Expires=4999655814&Signature=shvGNDmkyv9MLTw4%2BOxYglJCpAE%3D">https://aib-image.oss-ap-southeast-1.aliyuncs.com/ai_desc%2F250cc947-9cd5-4df0-9c23-44eba5d0dfc30.jpg?OSSAccessKeyId=LTAI5tSEGjGp5wixZgHLc3bV&amp;Expires=4999655814&amp;Signature=shvGNDmkyv9MLTw4%2BOxYglJCpAE%3D</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The asynchronous task ID. This parameter is returned in asynchronous mode and is used to query the task result.</p>
         * 
         * <strong>example:</strong>
         * <p>ed9d8504-6141-9fbb-8345-4fa36433483f</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage details. This parameter is returned in synchronous mode.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static ImageRemovalProResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageRemovalProResponseBodyData self = new ImageRemovalProResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageRemovalProResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ImageRemovalProResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ImageRemovalProResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
