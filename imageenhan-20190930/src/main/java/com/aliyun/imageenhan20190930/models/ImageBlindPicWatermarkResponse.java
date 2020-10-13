// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ImageBlindPicWatermarkResponseData data;

    public static ImageBlindPicWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindPicWatermarkResponse self = new ImageBlindPicWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public ImageBlindPicWatermarkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageBlindPicWatermarkResponse setData(ImageBlindPicWatermarkResponseData data) {
        this.data = data;
        return this;
    }
    public ImageBlindPicWatermarkResponseData getData() {
        return this.data;
    }

    public static class ImageBlindPicWatermarkResponseData extends TeaModel {
        @NameInMap("WatermarkImageURL")
        @Validation(required = true)
        public String watermarkImageURL;

        @NameInMap("LogoURL")
        @Validation(required = true)
        public String logoURL;

        public static ImageBlindPicWatermarkResponseData build(java.util.Map<String, ?> map) throws Exception {
            ImageBlindPicWatermarkResponseData self = new ImageBlindPicWatermarkResponseData();
            return TeaModel.build(map, self);
        }

        public ImageBlindPicWatermarkResponseData setWatermarkImageURL(String watermarkImageURL) {
            this.watermarkImageURL = watermarkImageURL;
            return this;
        }
        public String getWatermarkImageURL() {
            return this.watermarkImageURL;
        }

        public ImageBlindPicWatermarkResponseData setLogoURL(String logoURL) {
            this.logoURL = logoURL;
            return this;
        }
        public String getLogoURL() {
            return this.logoURL;
        }

    }

}
