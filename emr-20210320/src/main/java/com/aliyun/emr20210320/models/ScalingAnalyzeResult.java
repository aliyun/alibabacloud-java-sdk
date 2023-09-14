// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingAnalyzeResult extends TeaModel {
    /**
     * <p>实际资源利用率。</p>
     */
    @NameInMap("ActualUsage")
    public Float actualUsage;

    /**
     * <p>理想资源用量。</p>
     */
    @NameInMap("IdealUsage")
    public Float idealUsage;

    /**
     * <p>固定资源释放核数（非master）core。</p>
     */
    @NameInMap("ReleaseCores")
    public Integer releaseCores;

    /**
     * <p>固定资源保留核数（非master）core。</p>
     */
    @NameInMap("ReservedCores")
    public Integer reservedCores;

    public static ScalingAnalyzeResult build(java.util.Map<String, ?> map) throws Exception {
        ScalingAnalyzeResult self = new ScalingAnalyzeResult();
        return TeaModel.build(map, self);
    }

    public ScalingAnalyzeResult setActualUsage(Float actualUsage) {
        this.actualUsage = actualUsage;
        return this;
    }
    public Float getActualUsage() {
        return this.actualUsage;
    }

    public ScalingAnalyzeResult setIdealUsage(Float idealUsage) {
        this.idealUsage = idealUsage;
        return this;
    }
    public Float getIdealUsage() {
        return this.idealUsage;
    }

    public ScalingAnalyzeResult setReleaseCores(Integer releaseCores) {
        this.releaseCores = releaseCores;
        return this;
    }
    public Integer getReleaseCores() {
        return this.releaseCores;
    }

    public ScalingAnalyzeResult setReservedCores(Integer reservedCores) {
        this.reservedCores = reservedCores;
        return this;
    }
    public Integer getReservedCores() {
        return this.reservedCores;
    }

}
