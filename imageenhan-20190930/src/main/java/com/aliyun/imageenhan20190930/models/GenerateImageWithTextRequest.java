// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextRequest extends TeaModel {
    @NameInMap("Number")
    public Integer number;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("Text")
    public String text;

    public static GenerateImageWithTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageWithTextRequest self = new GenerateImageWithTextRequest();
        return TeaModel.build(map, self);
    }

    public GenerateImageWithTextRequest setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Integer getNumber() {
        return this.number;
    }

    public GenerateImageWithTextRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public GenerateImageWithTextRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
