// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Codes extends TeaModel {
    @NameInMap("Boundary")
    public Boundary boundary;

    @NameInMap("Confidence")
    public Float confidence;

    @NameInMap("Content")
    public String content;

    @NameInMap("Type")
    public String type;

    public static Codes build(java.util.Map<String, ?> map) throws Exception {
        Codes self = new Codes();
        return TeaModel.build(map, self);
    }

    public Codes setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Codes setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public Codes setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Codes setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
