// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Body extends TeaModel {
    @NameInMap("Boundary")
    public Boundary boundary;

    @NameInMap("Confidence")
    public Float confidence;

    public static Body build(java.util.Map<String, ?> map) throws Exception {
        Body self = new Body();
        return TeaModel.build(map, self);
    }

    public Body setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Body setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

}
