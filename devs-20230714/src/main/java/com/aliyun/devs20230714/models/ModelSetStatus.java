// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelSetStatus extends TeaModel {
    @NameInMap("observedGeneration")
    public Long observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    @NameInMap("phase")
    public String phase;

    public static ModelSetStatus build(java.util.Map<String, ?> map) throws Exception {
        ModelSetStatus self = new ModelSetStatus();
        return TeaModel.build(map, self);
    }

    public ModelSetStatus setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public ModelSetStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

    public ModelSetStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
