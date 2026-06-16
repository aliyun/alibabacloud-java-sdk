// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageCroppingResponseBody extends TeaModel {
    /**
     * <p>Response code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Crop result</p>
     */
    @NameInMap("Data")
    public ImageCroppingResponseBodyData data;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>Whether the call was successful: true indicates success, false indicates failure</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageCroppingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageCroppingResponseBody self = new ImageCroppingResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageCroppingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageCroppingResponseBody setData(ImageCroppingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageCroppingResponseBodyData getData() {
        return this.data;
    }

    public ImageCroppingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageCroppingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageCroppingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageCroppingResponseBodyData extends TeaModel {
        /**
         * <p>Image height</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>URL of the cropped image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/cropped.jpg">https://example.com/cropped.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>Usage information</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        /**
         * <p>Image width</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageCroppingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageCroppingResponseBodyData self = new ImageCroppingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageCroppingResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageCroppingResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ImageCroppingResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public ImageCroppingResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
