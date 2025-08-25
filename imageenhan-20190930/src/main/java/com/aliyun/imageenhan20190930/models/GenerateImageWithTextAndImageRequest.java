// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextAndImageRequest extends TeaModel {
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
    public String refImageUrl;

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

    public static GenerateImageWithTextAndImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageWithTextAndImageRequest self = new GenerateImageWithTextAndImageRequest();
        return TeaModel.build(map, self);
    }

    public GenerateImageWithTextAndImageRequest setAspectRatioMode(String aspectRatioMode) {
        this.aspectRatioMode = aspectRatioMode;
        return this;
    }
    public String getAspectRatioMode() {
        return this.aspectRatioMode;
    }

    public GenerateImageWithTextAndImageRequest setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Integer getNumber() {
        return this.number;
    }

    public GenerateImageWithTextAndImageRequest setRefImageUrl(String refImageUrl) {
        this.refImageUrl = refImageUrl;
        return this;
    }
    public String getRefImageUrl() {
        return this.refImageUrl;
    }

    public GenerateImageWithTextAndImageRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public GenerateImageWithTextAndImageRequest setSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }
    public Float getSimilarity() {
        return this.similarity;
    }

    public GenerateImageWithTextAndImageRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
