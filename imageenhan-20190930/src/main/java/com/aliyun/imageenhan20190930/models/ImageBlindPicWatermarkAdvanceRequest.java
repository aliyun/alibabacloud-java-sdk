// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindPicWatermarkAdvanceRequest extends TeaModel {
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
    public java.io.InputStream logoURLObject;

    /**
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxxxx.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxxxx.jpg</a></p>
     */
    @NameInMap("OriginImageURL")
    public java.io.InputStream originImageURLObject;

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
    public java.io.InputStream watermarkImageURLObject;

    public static ImageBlindPicWatermarkAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindPicWatermarkAdvanceRequest self = new ImageBlindPicWatermarkAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ImageBlindPicWatermarkAdvanceRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public ImageBlindPicWatermarkAdvanceRequest setLogoURLObject(java.io.InputStream logoURLObject) {
        this.logoURLObject = logoURLObject;
        return this;
    }
    public java.io.InputStream getLogoURLObject() {
        return this.logoURLObject;
    }

    public ImageBlindPicWatermarkAdvanceRequest setOriginImageURLObject(java.io.InputStream originImageURLObject) {
        this.originImageURLObject = originImageURLObject;
        return this;
    }
    public java.io.InputStream getOriginImageURLObject() {
        return this.originImageURLObject;
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

    public ImageBlindPicWatermarkAdvanceRequest setWatermarkImageURLObject(java.io.InputStream watermarkImageURLObject) {
        this.watermarkImageURLObject = watermarkImageURLObject;
        return this;
    }
    public java.io.InputStream getWatermarkImageURLObject() {
        return this.watermarkImageURLObject;
    }

}
