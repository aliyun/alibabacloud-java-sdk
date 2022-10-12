// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkAdvanceRequest extends TeaModel {
    @NameInMap("FunctionType")
    public String functionType;

    @NameInMap("OriginImageURL")
    public java.io.InputStream originImageURLObject;

    @NameInMap("OutputFileType")
    public String outputFileType;

    @NameInMap("QualityFactor")
    public Integer qualityFactor;

    @NameInMap("Text")
    public String text;

    @NameInMap("WatermarkImageURL")
    public java.io.InputStream watermarkImageURLObject;

    public static ImageBlindCharacterWatermarkAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkAdvanceRequest self = new ImageBlindCharacterWatermarkAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setOriginImageURLObject(java.io.InputStream originImageURLObject) {
        this.originImageURLObject = originImageURLObject;
        return this;
    }
    public java.io.InputStream getOriginImageURLObject() {
        return this.originImageURLObject;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setOutputFileType(String outputFileType) {
        this.outputFileType = outputFileType;
        return this;
    }
    public String getOutputFileType() {
        return this.outputFileType;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setQualityFactor(Integer qualityFactor) {
        this.qualityFactor = qualityFactor;
        return this;
    }
    public Integer getQualityFactor() {
        return this.qualityFactor;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setWatermarkImageURLObject(java.io.InputStream watermarkImageURLObject) {
        this.watermarkImageURLObject = watermarkImageURLObject;
        return this;
    }
    public java.io.InputStream getWatermarkImageURLObject() {
        return this.watermarkImageURLObject;
    }

}
