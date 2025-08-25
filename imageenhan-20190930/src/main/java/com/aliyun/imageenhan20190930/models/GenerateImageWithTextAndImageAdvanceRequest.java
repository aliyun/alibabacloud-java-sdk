// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextAndImageAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>center_crop</p>
     */
    @NameInMap("AspectRatioMode")
    public String aspectRatioMode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Number")
    public Integer number;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/yxrtest/%E6%96%87%E7%94%9F%E5%9B%BE/%E7%9D%A1%E8%8E%B2.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/yxrtest/%E6%96%87%E7%94%9F%E5%9B%BE/%E7%9D%A1%E8%8E%B2.jpg</a>&quot;</p>
     */
    @NameInMap("RefImageUrl")
    public java.io.InputStream refImageUrlObject;

    /**
     * <strong>example:</strong>
     * <p>1024*1024</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("Similarity")
    public Float similarity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    public static GenerateImageWithTextAndImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageWithTextAndImageAdvanceRequest self = new GenerateImageWithTextAndImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateImageWithTextAndImageAdvanceRequest setAspectRatioMode(String aspectRatioMode) {
        this.aspectRatioMode = aspectRatioMode;
        return this;
    }
    public String getAspectRatioMode() {
        return this.aspectRatioMode;
    }

    public GenerateImageWithTextAndImageAdvanceRequest setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Integer getNumber() {
        return this.number;
    }

    public GenerateImageWithTextAndImageAdvanceRequest setRefImageUrlObject(java.io.InputStream refImageUrlObject) {
        this.refImageUrlObject = refImageUrlObject;
        return this;
    }
    public java.io.InputStream getRefImageUrlObject() {
        return this.refImageUrlObject;
    }

    public GenerateImageWithTextAndImageAdvanceRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public GenerateImageWithTextAndImageAdvanceRequest setSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }
    public Float getSimilarity() {
        return this.similarity;
    }

    public GenerateImageWithTextAndImageAdvanceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
