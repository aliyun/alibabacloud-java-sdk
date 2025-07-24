// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AdviseSummary extends TeaModel {
    @NameInMap("MemoryUtilizationRate")
    public DoubleMetric memoryUtilizationRate;

    @NameInMap("VcoreUtilizationRate")
    public DoubleMetric vcoreUtilizationRate;

    public static AdviseSummary build(java.util.Map<String, ?> map) throws Exception {
        AdviseSummary self = new AdviseSummary();
        return TeaModel.build(map, self);
    }

    public AdviseSummary setMemoryUtilizationRate(DoubleMetric memoryUtilizationRate) {
        this.memoryUtilizationRate = memoryUtilizationRate;
        return this;
    }
    public DoubleMetric getMemoryUtilizationRate() {
        return this.memoryUtilizationRate;
    }

    public AdviseSummary setVcoreUtilizationRate(DoubleMetric vcoreUtilizationRate) {
        this.vcoreUtilizationRate = vcoreUtilizationRate;
        return this;
    }
    public DoubleMetric getVcoreUtilizationRate() {
        return this.vcoreUtilizationRate;
    }

}
