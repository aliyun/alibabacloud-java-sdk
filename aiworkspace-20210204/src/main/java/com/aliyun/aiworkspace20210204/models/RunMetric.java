// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RunMetric extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("Step")
    public Long step;

    @NameInMap("Timestamp")
    public Long timestamp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Value")
    public Float value;

    public static RunMetric build(java.util.Map<String, ?> map) throws Exception {
        RunMetric self = new RunMetric();
        return TeaModel.build(map, self);
    }

    public RunMetric setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RunMetric setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public RunMetric setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public RunMetric setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
