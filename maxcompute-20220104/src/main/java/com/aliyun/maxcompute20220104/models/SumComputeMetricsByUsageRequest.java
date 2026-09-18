// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumComputeMetricsByUsageRequest extends TeaModel {
    /**
     * <p>The end timestamp for the query, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1718590596556</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>The project names.</p>
     */
    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <p>The start timestamp for the query, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <p>The usage type. Valid values: <code>CU</code> (CU usage) and <code>SCAN</code> (scanned data volume).</p>
     * 
     * <strong>example:</strong>
     * <p>SCAN</p>
     */
    @NameInMap("usageType")
    public String usageType;

    public static SumComputeMetricsByUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        SumComputeMetricsByUsageRequest self = new SumComputeMetricsByUsageRequest();
        return TeaModel.build(map, self);
    }

    public SumComputeMetricsByUsageRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SumComputeMetricsByUsageRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public SumComputeMetricsByUsageRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SumComputeMetricsByUsageRequest setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

}
