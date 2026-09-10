// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmThresholdConfig extends TeaModel {
    /**
     * <p>The upper bound of the range.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The lower bound of the range.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The warning level.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
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
