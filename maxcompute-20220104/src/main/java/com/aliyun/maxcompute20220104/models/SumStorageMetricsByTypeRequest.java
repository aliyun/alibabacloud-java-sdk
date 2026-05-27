// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByTypeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1718590596556</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <strong>example:</strong>
     * <p>PROJECT</p>
     */
    @NameInMap("statsType")
    public String statsType;

    public static SumStorageMetricsByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SumStorageMetricsByTypeRequest self = new SumStorageMetricsByTypeRequest();
        return TeaModel.build(map, self);
    }

    public SumStorageMetricsByTypeRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SumStorageMetricsByTypeRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public SumStorageMetricsByTypeRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SumStorageMetricsByTypeRequest setStatsType(String statsType) {
        this.statsType = statsType;
        return this;
    }
    public String getStatsType() {
        return this.statsType;
    }

}
