// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>encode_pic</p>
     */
    @NameInMap("FunctionType")
    public String functionType;

    /**
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxxxx.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxxxx.jpg</a></p>
     */
    @NameInMap("LogoURL")
    public String logoURL;

    /**
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxxxx.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxxxx.jpg</a></p>
     */
    @NameInMap("OriginImageURL")
    public String originImageURL;

    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("OutputFileType")
    public String outputFileType;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("QualityFactor")
    public Integer qualityFactor;

    /**
     * <strong>example:</strong>
     * <p><a href="https://viapi-doc.oss-cn-shanghai.aliyuncs.com/imageenhan/xxxxx.jpg">https://viapi-doc.oss-cn-shanghai.aliyuncs.com/imageenhan/xxxxx.jpg</a></p>
     */
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
