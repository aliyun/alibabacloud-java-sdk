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

    public ImageBlindCharacterWatermarkRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public ImageBlindCharacterWatermarkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ImageBlindCharacterWatermarkRequest setWatermarkImageURL(String watermarkImageURL) {
        this.watermarkImageURL = watermarkImageURL;
        return this;
    }
    public String getWatermarkImageURL() {
        return this.watermarkImageURL;
    }

    public ImageBlindCharacterWatermarkRequest setOutputFileType(String outputFileType) {
        this.outputFileType = outputFileType;
        return this;
    }
    public String getOutputFileType() {
        return this.outputFileType;
    }

    public ImageBlindCharacterWatermarkRequest setQualityFactor(Integer qualityFactor) {
        this.qualityFactor = qualityFactor;
        return this;
    }
    public Integer getQualityFactor() {
        return this.qualityFactor;
    }

    public ImageBlindCharacterWatermarkRequest setOriginImageURL(String originImageURL) {
        this.originImageURL = originImageURL;
        return this;
    }
    public String getOriginImageURL() {
        return this.originImageURL;
    }

}
