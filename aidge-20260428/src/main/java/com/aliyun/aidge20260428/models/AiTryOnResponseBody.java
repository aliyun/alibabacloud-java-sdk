// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AiTryOnResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AiTryOnResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2728332e-72c1-9c0d-8869-5781b2cd25d4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessedImageCount")
        public Long processedImageCount;

        /**
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
         * <strong>example:</strong>
         * <p>1360</p>
         */
        @NameInMap("ImageHeight")
        public String imageHeight;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/virtual-try-on-result.png">https://example.com/virtual-try-on-result.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>768</p>
         */
        @NameInMap("ImageWidth")
        public String imageWidth;

        /**
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
