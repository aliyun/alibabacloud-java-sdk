// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkRequest extends TeaModel {
    @NameInMap("FunctionType")
    @Validation(required = true)
    public String functionType;

    @NameInMap("Text")
    public String text;

    @NameInMap("WatermarkImageURL")
    public String watermarkImageURL;

    @NameInMap("OutputFileType")
    public String outputFileType;

    @NameInMap("QualityFactor")
    @Validation(required = true)
    public Integer qualityFactor;

    @NameInMap("OriginImageURL")
    @Validation(required = true)
    public String originImageURL;

    public static ImageBlindCharacterWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkRequest self = new ImageBlindCharacterWatermarkRequest();
        return TeaModel.build(map, self);
    }

}
