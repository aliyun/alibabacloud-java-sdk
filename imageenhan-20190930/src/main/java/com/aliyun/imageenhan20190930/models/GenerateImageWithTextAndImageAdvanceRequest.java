// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextAndImageAdvanceRequest extends TeaModel {
    @NameInMap("AspectRatioMode")
    public String aspectRatioMode;

    @NameInMap("Number")
    public Integer number;

    @NameInMap("RefImageUrl")
    public java.io.InputStream refImageUrlObject;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("Similarity")
    public Float similarity;

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
