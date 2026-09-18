// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumComputeMetricsByRecordRequest extends TeaModel {
    /**
     * <p>The end of the time range to query, specified as a required Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1718590596556</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>The list of project names.</p>
     */
    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <p>The start of the time range to query, specified as a required Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    public static SumComputeMetricsByRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SumComputeMetricsByRecordRequest self = new SumComputeMetricsByRecordRequest();
        return TeaModel.build(map, self);
    }

    public SumComputeMetricsByRecordRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SumComputeMetricsByRecordRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public SumComputeMetricsByRecordRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
