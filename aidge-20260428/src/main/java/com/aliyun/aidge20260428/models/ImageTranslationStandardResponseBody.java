// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationStandardResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates a successful call. For other response codes, see the error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The translation result data, including the translated image URL and usage information.</p>
     */
    @NameInMap("Data")
    public ImageTranslationStandardResponseBodyData data;

    /**
     * <p>The error message. &quot;Success&quot; is returned for a successful call. A specific error message is returned for a failed call.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CEC4D94-905A-1ED1-A7B4-1BFEFFB3D850</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageTranslationStandardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationStandardResponseBody self = new ImageTranslationStandardResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageTranslationStandardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageTranslationStandardResponseBody setData(ImageTranslationStandardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageTranslationStandardResponseBodyData getData() {
        return this.data;
    }

    public ImageTranslationStandardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageTranslationStandardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageTranslationStandardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageTranslationStandardResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the image generated after image translation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The usage information, including the number of processed images.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static ImageTranslationStandardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyData self = new ImageTranslationStandardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ImageTranslationStandardResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
