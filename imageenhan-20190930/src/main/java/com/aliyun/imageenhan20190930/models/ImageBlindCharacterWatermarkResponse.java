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

    }

}
