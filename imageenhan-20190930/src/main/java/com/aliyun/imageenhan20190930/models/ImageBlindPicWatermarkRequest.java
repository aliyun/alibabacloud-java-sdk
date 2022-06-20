// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkRequest extends TeaModel {
    @NameInMap("FunctionType")
    public String functionType;

    @NameInMap("LogoURL")
    public String logoURL;

    @NameInMap("OriginImageURL")
    public String originImageURL;

    @NameInMap("OutputFileType")
    public String outputFileType;

    @NameInMap("QualityFactor")
    public Integer qualityFactor;

    @NameInMap("WatermarkImageURL")
    public String watermarkImageURL;

    public static ImageBlindPicWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindPicWatermarkRequest self = new ImageBlindPicWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public ImageBlindPicWatermarkRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public ImageBlindPicWatermarkRequest setLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }
    public String getLogoURL() {
        return this.logoURL;
    }

    public ImageBlindPicWatermarkRequest setOriginImageURL(String originImageURL) {
        this.originImageURL = originImageURL;
        return this;
    }
    public String getOriginImageURL() {
        return this.originImageURL;
    }

    public ImageBlindPicWatermarkRequest setOutputFileType(String outputFileType) {
        this.outputFileType = outputFileType;
        return this;
    }
    public String getOutputFileType() {
        return this.outputFileType;
    }

    public ImageBlindPicWatermarkRequest setQualityFactor(Integer qualityFactor) {
        this.qualityFactor = qualityFactor;
        return this;
    }
    public Integer getQualityFactor() {
        return this.qualityFactor;
    }

    public ImageBlindPicWatermarkRequest setWatermarkImageURL(String watermarkImageURL) {
        this.watermarkImageURL = watermarkImageURL;
        return this;
    }
    public String getWatermarkImageURL() {
        return this.watermarkImageURL;
    }

}
