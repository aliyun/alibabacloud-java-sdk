// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Optimization extends TeaModel {
    @NameInMap("LearningRate")
    public Float learningRate;

    @NameInMap("Optimizer")
    public String optimizer;

    public static Optimization build(java.util.Map<String, ?> map) throws Exception {
        Optimization self = new Optimization();
        return TeaModel.build(map, self);
    }

    public Optimization setLearningRate(Float learningRate) {
        this.learningRate = learningRate;
        return this;
    }
    public Float getLearningRate() {
        return this.learningRate;
    }

    public Optimization setOptimizer(String optimizer) {
        this.optimizer = optimizer;
        return this;
    }
    public String getOptimizer() {
        return this.optimizer;
    }

}
