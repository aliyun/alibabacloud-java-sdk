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

    public ImageBlindPicWatermarkAdvanceRequest setOriginImageURLObject(java.io.InputStream originImageURLObject) {
        this.originImageURLObject = originImageURLObject;
        return this;
    }
    public java.io.InputStream getOriginImageURLObject() {
        return this.originImageURLObject;
    }

    public ImageBlindPicWatermarkAdvanceRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public ImageBlindPicWatermarkAdvanceRequest setLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }
    public String getLogoURL() {
        return this.logoURL;
    }

    public ImageBlindPicWatermarkAdvanceRequest setWatermarkImageURL(String watermarkImageURL) {
        this.watermarkImageURL = watermarkImageURL;
        return this;
    }
    public String getWatermarkImageURL() {
        return this.watermarkImageURL;
    }

    public ImageBlindPicWatermarkAdvanceRequest setOutputFileType(String outputFileType) {
        this.outputFileType = outputFileType;
        return this;
    }
    public String getOutputFileType() {
        return this.outputFileType;
    }

    public ImageBlindPicWatermarkAdvanceRequest setQualityFactor(Integer qualityFactor) {
        this.qualityFactor = qualityFactor;
        return this;
    }
    public Integer getQualityFactor() {
        return this.qualityFactor;
    }

}
