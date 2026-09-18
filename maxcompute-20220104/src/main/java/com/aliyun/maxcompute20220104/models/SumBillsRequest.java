// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumBillsRequest extends TeaModel {
    /**
     * <p>The end time of the billing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1776232895313</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>A list of instance names. This parameter is not required if <code>statsType</code> is set to <code>FEE_ITEM</code>.</p>
     */
    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <p>The start time of the billing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <p>The dimension by which to summarize costs. Valid values: <code>PROJECT</code> (by instance) and <code>FEE_ITEM</code> (by billable item).</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT</p>
     */
    @NameInMap("statsType")
    public String statsType;

    /**
     * <p>The number of top results to return after sorting by cost.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("topN")
    public Integer topN;

    public static SumBillsRequest build(java.util.Map<String, ?> map) throws Exception {
        SumBillsRequest self = new SumBillsRequest();
        return TeaModel.build(map, self);
    }

    public SumBillsRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SumBillsRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public SumBillsRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SumBillsRequest setStatsType(String statsType) {
        this.statsType = statsType;
        return this;
    }
    public String getStatsType() {
        return this.statsType;
    }

    public SumBillsRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

}
