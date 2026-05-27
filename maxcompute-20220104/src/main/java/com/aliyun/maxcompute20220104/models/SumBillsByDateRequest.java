// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumBillsByDateRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("topN")
    public Integer topN;

    public static SumBillsByDateRequest build(java.util.Map<String, ?> map) throws Exception {
        SumBillsByDateRequest self = new SumBillsByDateRequest();
        return TeaModel.build(map, self);
    }

    public SumBillsByDateRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SumBillsByDateRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public SumBillsByDateRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SumBillsByDateRequest setStatsType(String statsType) {
        this.statsType = statsType;
        return this;
    }
    public String getStatsType() {
        return this.statsType;
    }

    public SumBillsByDateRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

}
