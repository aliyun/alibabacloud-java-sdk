// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ImageBlindCharacterWatermarkResponseData data;

    public static ImageBlindCharacterWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkResponse self = new ImageBlindCharacterWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public ImageBlindCharacterWatermarkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageBlindCharacterWatermarkResponse setData(ImageBlindCharacterWatermarkResponseData data) {
        this.data = data;
        return this;
    }
    public ImageBlindCharacterWatermarkResponseData getData() {
        return this.data;
    }

    public static class ImageBlindCharacterWatermarkResponseData extends TeaModel {
        @NameInMap("WatermarkImageURL")
        @Validation(required = true)
        public String watermarkImageURL;

        @NameInMap("TextImageURL")
        @Validation(required = true)
        public String textImageURL;

        public static ImageBlindCharacterWatermarkResponseData build(java.util.Map<String, ?> map) throws Exception {
            ImageBlindCharacterWatermarkResponseData self = new ImageBlindCharacterWatermarkResponseData();
            return TeaModel.build(map, self);
        }

        public ImageBlindCharacterWatermarkResponseData setWatermarkImageURL(String watermarkImageURL) {
            this.watermarkImageURL = watermarkImageURL;
            return this;
        }
        public String getWatermarkImageURL() {
            return this.watermarkImageURL;
        }

        public ImageBlindCharacterWatermarkResponseData setTextImageURL(String textImageURL) {
            this.textImageURL = textImageURL;
            return this;
        }
        public String getTextImageURL() {
            return this.textImageURL;
        }

    }

}
