// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ThresholdList extends TeaModel {
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

    public static ThresholdList build(java.util.Map<String, ?> map) throws Exception {
        ThresholdList self = new ThresholdList();
        return TeaModel.build(map, self);
    }

    public ThresholdList setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public ThresholdList setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public ThresholdList setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ThresholdList setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
