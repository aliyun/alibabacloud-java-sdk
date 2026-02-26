// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class LicensePlate extends TeaModel {
    /**
     * <p>The boundary information of the license plate.</p>
     */
    @NameInMap("Boundary")
    public Boundary boundary;

    /**
     * <p>The confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.789</p>
     */
    @NameInMap("Confidence")
    public Double confidence;

    /**
     * <p>The license plate number.</p>
     */
    @NameInMap("Content")
    public String content;

    public static LicensePlate build(java.util.Map<String, ?> map) throws Exception {
        LicensePlate self = new LicensePlate();
        return TeaModel.build(map, self);
    }

    public LicensePlate setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public LicensePlate setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
    public Double getConfidence() {
        return this.confidence;
    }

    public LicensePlate setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
