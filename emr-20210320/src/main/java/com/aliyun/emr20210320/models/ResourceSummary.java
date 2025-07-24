// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ResourceSummary extends TeaModel {
    @NameInMap("InefficientTaskRate")
    public DoubleMetric inefficientTaskRate;

    @NameInMap("MemoryUtilizationRate")
    public DoubleMetric memoryUtilizationRate;

    @NameInMap("OriginalTotalVcore")
    public IntegerMetric originalTotalVcore;

    @NameInMap("VcoreUtilizationRate")
    public DoubleMetric vcoreUtilizationRate;

    public static ResourceSummary build(java.util.Map<String, ?> map) throws Exception {
        ResourceSummary self = new ResourceSummary();
        return TeaModel.build(map, self);
    }

    public ResourceSummary setInefficientTaskRate(DoubleMetric inefficientTaskRate) {
        this.inefficientTaskRate = inefficientTaskRate;
        return this;
    }
    public DoubleMetric getInefficientTaskRate() {
        return this.inefficientTaskRate;
    }

    public ResourceSummary setMemoryUtilizationRate(DoubleMetric memoryUtilizationRate) {
        this.memoryUtilizationRate = memoryUtilizationRate;
        return this;
    }
    public DoubleMetric getMemoryUtilizationRate() {
        return this.memoryUtilizationRate;
    }

    public ResourceSummary setOriginalTotalVcore(IntegerMetric originalTotalVcore) {
        this.originalTotalVcore = originalTotalVcore;
        return this;
    }
    public IntegerMetric getOriginalTotalVcore() {
        return this.originalTotalVcore;
    }

    public ResourceSummary setVcoreUtilizationRate(DoubleMetric vcoreUtilizationRate) {
        this.vcoreUtilizationRate = vcoreUtilizationRate;
        return this;
    }
    public DoubleMetric getVcoreUtilizationRate() {
        return this.vcoreUtilizationRate;
    }

}
