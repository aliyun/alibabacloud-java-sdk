// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkAdvanceRequest extends TeaModel {
    @NameInMap("OriginImageURLObject")
    @Validation(required = true)
    public java.io.InputStream originImageURLObject;

    @NameInMap("FunctionType")
    @Validation(required = true)
    public String functionType;

    @NameInMap("LogoURL")
    public String logoURL;

    @NameInMap("WatermarkImageURL")
    public String watermarkImageURL;

    @NameInMap("OutputFileType")
    public String outputFileType;

    @NameInMap("QualityFactor")
    @Validation(required = true)
    public Integer qualityFactor;

    public static ImageBlindPicWatermarkAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindPicWatermarkAdvanceRequest self = new ImageBlindPicWatermarkAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
