// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CroppingSuggestion extends TeaModel {
    // AspectRatio
    @NameInMap("AspectRatio")
    public String aspectRatio;

    // Confidence
    @NameInMap("Confidence")
    public Float confidence;

    // Boundary
    @NameInMap("Boundary")
    public Boundary boundary;

    public static CroppingSuggestion build(java.util.Map<String, ?> map) throws Exception {
        CroppingSuggestion self = new CroppingSuggestion();
        return TeaModel.build(map, self);
    }

    public CroppingSuggestion setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public CroppingSuggestion setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public CroppingSuggestion setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

}
