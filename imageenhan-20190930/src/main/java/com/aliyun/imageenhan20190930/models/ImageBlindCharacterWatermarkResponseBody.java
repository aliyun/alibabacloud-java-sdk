// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImageBlindCharacterWatermarkResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2457E1ED-9C76-4386-B9A2-7E41B7D6E849</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImageBlindCharacterWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkResponseBody self = new ImageBlindCharacterWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageBlindCharacterWatermarkResponseBody setData(ImageBlindCharacterWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageBlindCharacterWatermarkResponseBodyData getData() {
        return this.data;
    }

    public ImageBlindCharacterWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageBlindCharacterWatermarkResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&Expires=158340****&Signature=Heet1ivG0xFP3YlO6usvd0pmrH">http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&amp;Expires=158340****&amp;Signature=Heet1ivG0xFP3YlO6usvd0pmrH</a>****</p>
         */
        @NameInMap("TextImageURL")
        public String textImageURL;

        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&Expires=158340****&Signature=Heet1ivG0xFP3YlO6usvd0pmrH">http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&amp;Expires=158340****&amp;Signature=Heet1ivG0xFP3YlO6usvd0pmrH</a>****</p>
         */
        @NameInMap("WatermarkImageURL")
        public String watermarkImageURL;

        public static ImageBlindCharacterWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageBlindCharacterWatermarkResponseBodyData self = new ImageBlindCharacterWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageBlindCharacterWatermarkResponseBodyData setTextImageURL(String textImageURL) {
            this.textImageURL = textImageURL;
            return this;
        }
        public String getTextImageURL() {
            return this.textImageURL;
        }

        public ImageBlindCharacterWatermarkResponseBodyData setWatermarkImageURL(String watermarkImageURL) {
            this.watermarkImageURL = watermarkImageURL;
            return this;
        }
        public String getWatermarkImageURL() {
            return this.watermarkImageURL;
        }

    }

}
