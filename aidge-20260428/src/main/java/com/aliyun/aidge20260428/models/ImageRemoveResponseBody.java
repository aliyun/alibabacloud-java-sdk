// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The intelligent erasure result.</p>
     */
    @NameInMap("Data")
    public ImageRemoveResponseBodyData data;

    /**
     * <p>The error message.</p>
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
     * <p>2728332e-72c1-9c0d-8869-5781b2cd25d4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageRemoveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveResponseBody self = new ImageRemoveResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageRemoveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageRemoveResponseBody setData(ImageRemoveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageRemoveResponseBodyData getData() {
        return this.data;
    }

    public ImageRemoveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageRemoveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageRemoveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageRemoveResponseBodyData extends TeaModel {
        /**
         * <p>The height of the result image, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The URL of the result image after erasure.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-7c2c.oss-cn-shanghai.aliyuncs.com/xxx.jpg">http://dashscope-7c2c.oss-cn-shanghai.aliyuncs.com/xxx.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        /**
         * <p>The width of the result image, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageRemoveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageRemoveResponseBodyData self = new ImageRemoveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageRemoveResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageRemoveResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ImageRemoveResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public ImageRemoveResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
