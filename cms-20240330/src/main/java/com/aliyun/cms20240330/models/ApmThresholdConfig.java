// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmThresholdConfig extends TeaModel {
    @NameInMap("max")
    public Double max;

    @NameInMap("min")
    public Double min;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("severity")
    public String severity;

    @NameInMap("threshold")
    public Float threshold;

    public static ApmThresholdConfig build(java.util.Map<String, ?> map) throws Exception {
        ApmThresholdConfig self = new ApmThresholdConfig();
        return TeaModel.build(map, self);
    }

    public ApmThresholdConfig setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public ApmThresholdConfig setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public ApmThresholdConfig setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ApmThresholdConfig setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
