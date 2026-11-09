// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageUpscaleResponseBody extends TeaModel {
    /**
     * <p>The status code, such as success.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result struct information.</p>
     */
    @NameInMap("Data")
    public ImageUpscaleResponseBodyData data;

    /**
     * <p>The returned message or error prompt.</p>
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
     * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageUpscaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageUpscaleResponseBody self = new ImageUpscaleResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageUpscaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageUpscaleResponseBody setData(ImageUpscaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageUpscaleResponseBodyData getData() {
        return this.data;
    }

    public ImageUpscaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageUpscaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageUpscaleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageUpscaleResponseBodyDataData extends TeaModel {
        /**
         * <p>The actual height of the generated image.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("ImageHeight")
        public Integer imageHeight;

        /**
         * <p>The result information of the high-definition upscaling for a single image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/output.png">https://example.com/output.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The actual width of the generated image.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("ImageWidth")
        public Integer imageWidth;

        public static ImageUpscaleResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ImageUpscaleResponseBodyDataData self = new ImageUpscaleResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ImageUpscaleResponseBodyDataData setImageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Integer getImageHeight() {
            return this.imageHeight;
        }

        public ImageUpscaleResponseBodyDataData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ImageUpscaleResponseBodyDataData setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Integer getImageWidth() {
            return this.imageWidth;
        }

    }

    public static class ImageUpscaleResponseBodyDataUsageMap extends TeaModel {
        /**
         * <p>The number of processed images.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessedImageCount")
        public Integer processedImageCount;

        public static ImageUpscaleResponseBodyDataUsageMap build(java.util.Map<String, ?> map) throws Exception {
            ImageUpscaleResponseBodyDataUsageMap self = new ImageUpscaleResponseBodyDataUsageMap();
            return TeaModel.build(map, self);
        }

        public ImageUpscaleResponseBodyDataUsageMap setProcessedImageCount(Integer processedImageCount) {
            this.processedImageCount = processedImageCount;
            return this;
        }
        public Integer getProcessedImageCount() {
            return this.processedImageCount;
        }

    }

    public static class ImageUpscaleResponseBodyData extends TeaModel {
        /**
         * <p>The high-definition upscaling result data.</p>
         */
        @NameInMap("Data")
        public ImageUpscaleResponseBodyDataData data;

        /**
         * <p>The error code. Returned upon failure, such as InvalidParameter or DownstreamUnavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. Returned upon failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the operation is successful. A value of true indicates success, and a value of false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The downstream task ID. This parameter is empty for synchronous operations.</p>
         * 
         * <strong>example:</strong>
         * <p>ed9d8504-6141-9fbb-8345-4fa36433483f</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage information.</p>
         */
        @NameInMap("UsageMap")
        public ImageUpscaleResponseBodyDataUsageMap usageMap;

        public static ImageUpscaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageUpscaleResponseBodyData self = new ImageUpscaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageUpscaleResponseBodyData setData(ImageUpscaleResponseBodyDataData data) {
            this.data = data;
            return this;
        }
        public ImageUpscaleResponseBodyDataData getData() {
            return this.data;
        }

        public ImageUpscaleResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ImageUpscaleResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ImageUpscaleResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ImageUpscaleResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ImageUpscaleResponseBodyData setUsageMap(ImageUpscaleResponseBodyDataUsageMap usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public ImageUpscaleResponseBodyDataUsageMap getUsageMap() {
            return this.usageMap;
        }

    }

}
