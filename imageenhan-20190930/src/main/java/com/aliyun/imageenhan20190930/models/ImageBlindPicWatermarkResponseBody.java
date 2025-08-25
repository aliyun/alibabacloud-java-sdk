// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImageBlindPicWatermarkResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DE7869E4-0ACE-4C02-8B98-540B49F49205</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImageBlindPicWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindPicWatermarkResponseBody self = new ImageBlindPicWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageBlindPicWatermarkResponseBody setData(ImageBlindPicWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageBlindPicWatermarkResponseBodyData getData() {
        return this.data;
    }

    public ImageBlindPicWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageBlindPicWatermarkResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&Expires=158340****&Signature=Heet1ivG0xFP3YlO6usvd0pmrH">http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&amp;Expires=158340****&amp;Signature=Heet1ivG0xFP3YlO6usvd0pmrH</a>****</p>
         */
        @NameInMap("LogoURL")
        public String logoURL;

        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&Expires=158340****&Signature=Heet1ivG0xFP3YlO6usvd0pmrH">http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&amp;Expires=158340****&amp;Signature=Heet1ivG0xFP3YlO6usvd0pmrH</a>****</p>
         */
        @NameInMap("WatermarkImageURL")
        public String watermarkImageURL;

        public static ImageBlindPicWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageBlindPicWatermarkResponseBodyData self = new ImageBlindPicWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageBlindPicWatermarkResponseBodyData setLogoURL(String logoURL) {
            this.logoURL = logoURL;
            return this;
        }
        public String getLogoURL() {
            return this.logoURL;
        }

        public ImageBlindPicWatermarkResponseBodyData setWatermarkImageURL(String watermarkImageURL) {
            this.watermarkImageURL = watermarkImageURL;
            return this;
        }
        public String getWatermarkImageURL() {
            return this.watermarkImageURL;
        }

    }

}
