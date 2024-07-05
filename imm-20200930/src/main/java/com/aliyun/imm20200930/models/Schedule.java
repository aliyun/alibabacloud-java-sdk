// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Schedule extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("Gamma")
    public Float gamma;

    /**
     * <strong>example:</strong>
     * <p>StepLR</p>
     */
    @NameInMap("LRScheduler")
    public String LRScheduler;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StepSize")
    public Long stepSize;

    public static Schedule build(java.util.Map<String, ?> map) throws Exception {
        Schedule self = new Schedule();
        return TeaModel.build(map, self);
    }

    public Schedule setGamma(Float gamma) {
        this.gamma = gamma;
        return this;
    }
    public Float getGamma() {
        return this.gamma;
    }

    public Schedule setLRScheduler(String LRScheduler) {
        this.LRScheduler = LRScheduler;
        return this;
    }
    public String getLRScheduler() {
        return this.LRScheduler;
    }

    public Schedule setStepSize(Long stepSize) {
        this.stepSize = stepSize;
        return this;
    }
    public Long getStepSize() {
        return this.stepSize;
    }

}
