// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextAndImageRequest extends TeaModel {
    @NameInMap("AspectRatioMode")
    public String aspectRatioMode;

    @NameInMap("Number")
    public Integer number;

    @NameInMap("RefImageUrl")
    public String refImageUrl;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("Similarity")
    public Float similarity;

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
