// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AiTryOnResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result struct.</p>
     */
    @NameInMap("Data")
    public AiTryOnResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Used to uniquely identify a request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AiTryOnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AiTryOnResponseBody self = new AiTryOnResponseBody();
        return TeaModel.build(map, self);
    }

    public AiTryOnResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AiTryOnResponseBody setData(AiTryOnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AiTryOnResponseBodyData getData() {
        return this.data;
    }

    public AiTryOnResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AiTryOnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AiTryOnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AiTryOnResponseBodyDataUsageMap extends TeaModel {
        /**
         * <p>The number of processed images.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessedImageCount")
        public Long processedImageCount;

        /**
         * <p>The resolution of the processed image.</p>
         * 
         * <strong>example:</strong>
         * <p>1K</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        public static AiTryOnResponseBodyDataUsageMap build(java.util.Map<String, ?> map) throws Exception {
            AiTryOnResponseBodyDataUsageMap self = new AiTryOnResponseBodyDataUsageMap();
            return TeaModel.build(map, self);
        }

        public AiTryOnResponseBodyDataUsageMap setProcessedImageCount(Long processedImageCount) {
            this.processedImageCount = processedImageCount;
            return this;
        }
        public Long getProcessedImageCount() {
            return this.processedImageCount;
        }

        public AiTryOnResponseBodyDataUsageMap setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

    }

    public static class AiTryOnResponseBodyData extends TeaModel {
        /**
         * <p>The height of the result image, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1360</p>
         */
        @NameInMap("ImageHeight")
        public String imageHeight;

        /**
         * <p>The URL of the virtual try-on result image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/virtual-try-on-result.png">https://example.com/virtual-try-on-result.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The width of the result image, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>768</p>
         */
        @NameInMap("ImageWidth")
        public String imageWidth;

        /**
         * <p>The usage details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1,&quot;Resolution&quot;:&quot;1K&quot;}</p>
         */
        @NameInMap("UsageMap")
        public AiTryOnResponseBodyDataUsageMap usageMap;

        public static AiTryOnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AiTryOnResponseBodyData self = new AiTryOnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AiTryOnResponseBodyData setImageHeight(String imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public String getImageHeight() {
            return this.imageHeight;
        }

        public AiTryOnResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public AiTryOnResponseBodyData setImageWidth(String imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public String getImageWidth() {
            return this.imageWidth;
        }

        public AiTryOnResponseBodyData setUsageMap(AiTryOnResponseBodyDataUsageMap usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public AiTryOnResponseBodyDataUsageMap getUsageMap() {
            return this.usageMap;
        }

    }

}
