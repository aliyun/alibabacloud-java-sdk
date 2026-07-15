// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageMattingResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The matting result.</p>
     */
    @NameInMap("Data")
    public ImageMattingResponseBodyData data;

    /**
     * <p>The error message.</p>
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
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageMattingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageMattingResponseBody self = new ImageMattingResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageMattingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageMattingResponseBody setData(ImageMattingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageMattingResponseBodyData getData() {
        return this.data;
    }

    public ImageMattingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageMattingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageMattingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageMattingResponseBodyData extends TeaModel {
        /**
         * <p>The height of the result image in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The URL of the matting result image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-7c2c.oss-cn-shanghai.aliyuncs.com/xxx.jpg">http://dashscope-7c2c.oss-cn-shanghai.aliyuncs.com/xxx.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The matting quality score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.11</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        /**
         * <p>The width of the result image in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageMattingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageMattingResponseBodyData self = new ImageMattingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageMattingResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageMattingResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ImageMattingResponseBodyData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ImageMattingResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public ImageMattingResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
