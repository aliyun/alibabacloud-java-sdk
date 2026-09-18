// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByDateRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value must be a timestamp in milliseconds. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718590596556</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>The project names. If this parameter is not specified, the data of all projects is returned.</p>
     */
    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <p>The beginning of the time range to query. The value must be a timestamp in milliseconds. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <p>The dimension for aggregating storage metrics. This parameter is required. Valid values:</p>
     * <ul>
     * <li><p><code>PROJECT</code></p>
     * </li>
     * <li><p><code>STORAGE_TYPE</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROJECT</p>
     */
    @NameInMap("statsType")
    public String statsType;

    public static SumStorageMetricsByDateRequest build(java.util.Map<String, ?> map) throws Exception {
        SumStorageMetricsByDateRequest self = new SumStorageMetricsByDateRequest();
        return TeaModel.build(map, self);
    }

    public SumStorageMetricsByDateRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SumStorageMetricsByDateRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public SumStorageMetricsByDateRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SumStorageMetricsByDateRequest setStatsType(String statsType) {
        this.statsType = statsType;
        return this;
    }
    public String getStatsType() {
        return this.statsType;
    }

}
