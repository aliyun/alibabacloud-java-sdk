// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImageBlindCharacterWatermarkResponseBodyData data;

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
        @NameInMap("TextImageURL")
        public String textImageURL;

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
