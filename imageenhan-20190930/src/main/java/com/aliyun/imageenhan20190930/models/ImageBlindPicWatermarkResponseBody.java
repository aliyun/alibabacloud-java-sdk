// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ImageBlindPicWatermarkResponseBodyData data;

    public static ImageBlindPicWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindPicWatermarkResponseBody self = new ImageBlindPicWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageBlindPicWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageBlindPicWatermarkResponseBody setData(ImageBlindPicWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageBlindPicWatermarkResponseBodyData getData() {
        return this.data;
    }

    public static class ImageBlindPicWatermarkResponseBodyData extends TeaModel {
        @NameInMap("WatermarkImageURL")
        public String watermarkImageURL;

        @NameInMap("LogoURL")
        public String logoURL;

        public static ImageBlindPicWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageBlindPicWatermarkResponseBodyData self = new ImageBlindPicWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageBlindPicWatermarkResponseBodyData setWatermarkImageURL(String watermarkImageURL) {
            this.watermarkImageURL = watermarkImageURL;
            return this;
        }
        public String getWatermarkImageURL() {
            return this.watermarkImageURL;
        }

        public ImageBlindPicWatermarkResponseBodyData setLogoURL(String logoURL) {
            this.logoURL = logoURL;
            return this;
        }
        public String getLogoURL() {
            return this.logoURL;
        }

    }

}
