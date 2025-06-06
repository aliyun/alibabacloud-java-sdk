// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ToolsetStatus extends TeaModel {
    @NameInMap("observedGeneration")
    public Long observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    @NameInMap("outputs")
    public java.util.Map<String, ?> outputs;

    /**
     * <strong>example:</strong>
     * <p>Installed</p>
     */
    @NameInMap("phase")
    public String phase;

    public static ToolsetStatus build(java.util.Map<String, ?> map) throws Exception {
        ToolsetStatus self = new ToolsetStatus();
        return TeaModel.build(map, self);
    }

    public ToolsetStatus setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public ToolsetStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

    public ToolsetStatus setOutputs(java.util.Map<String, ?> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.Map<String, ?> getOutputs() {
        return this.outputs;
    }

    public ToolsetStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
