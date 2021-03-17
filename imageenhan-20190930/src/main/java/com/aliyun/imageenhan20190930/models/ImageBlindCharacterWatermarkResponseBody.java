// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ImageBlindCharacterWatermarkResponseBodyData data;

    public static ImageBlindCharacterWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkResponseBody self = new ImageBlindCharacterWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageBlindCharacterWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageBlindCharacterWatermarkResponseBody setData(ImageBlindCharacterWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageBlindCharacterWatermarkResponseBodyData getData() {
        return this.data;
    }

    public static class ImageBlindCharacterWatermarkResponseBodyData extends TeaModel {
        @NameInMap("WatermarkImageURL")
        public String watermarkImageURL;

        @NameInMap("TextImageURL")
        public String textImageURL;

        public static ImageBlindCharacterWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageBlindCharacterWatermarkResponseBodyData self = new ImageBlindCharacterWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageBlindCharacterWatermarkResponseBodyData setWatermarkImageURL(String watermarkImageURL) {
            this.watermarkImageURL = watermarkImageURL;
            return this;
        }
        public String getWatermarkImageURL() {
            return this.watermarkImageURL;
        }

        public ImageBlindCharacterWatermarkResponseBodyData setTextImageURL(String textImageURL) {
            this.textImageURL = textImageURL;
            return this;
        }
        public String getTextImageURL() {
            return this.textImageURL;
        }

    }

}
