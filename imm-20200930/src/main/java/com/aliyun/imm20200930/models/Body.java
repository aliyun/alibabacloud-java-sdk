// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Body extends TeaModel {
    /**
     * <p>The boundary of the human body.</p>
     */
    @NameInMap("Boundary")
    public Boundary boundary;

    /**
     * <p>The confidence level of the result. A higher value indicates greater confidence. Specifically, a value exceeding 0.8 signifies a high degree of confidence in the result.</p>
     * 
     * <strong>example:</strong>
     * <p>0.75</p>
     */
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
