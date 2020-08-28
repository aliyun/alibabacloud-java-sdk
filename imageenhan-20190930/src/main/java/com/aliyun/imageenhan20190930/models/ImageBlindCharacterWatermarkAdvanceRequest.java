// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkAdvanceRequest extends TeaModel {
    @NameInMap("OriginImageURLObject")
    @Validation(required = true)
    public java.io.InputStream originImageURLObject;

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

    public static ImageBlindCharacterWatermarkAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkAdvanceRequest self = new ImageBlindCharacterWatermarkAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
