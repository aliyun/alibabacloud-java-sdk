// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class OCRContents extends TeaModel {
    // Language
    @NameInMap("Language")
    public String language;

    // Contents
    @NameInMap("Contents")
    public String contents;

    // Confidence
    @NameInMap("Confidence")
    public Float confidence;

    // Boundary
    @NameInMap("Boundary")
    public Boundary boundary;

    public static OCRContents build(java.util.Map<String, ?> map) throws Exception {
        OCRContents self = new OCRContents();
        return TeaModel.build(map, self);
    }

    public OCRContents setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public OCRContents setContents(String contents) {
        this.contents = contents;
        return this;
    }
    public String getContents() {
        return this.contents;
    }

    public OCRContents setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public OCRContents setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

}
