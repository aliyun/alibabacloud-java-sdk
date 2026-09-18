// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumDailyBillsByItemRequest extends TeaModel {
    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    @NameInMap("startDate")
    public Long startDate;

    @NameInMap("statsType")
    public String statsType;

    @NameInMap("types")
    public java.util.List<String> types;

    public static SumDailyBillsByItemRequest build(java.util.Map<String, ?> map) throws Exception {
        SumDailyBillsByItemRequest self = new SumDailyBillsByItemRequest();
        return TeaModel.build(map, self);
    }

    public SumDailyBillsByItemRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SumDailyBillsByItemRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SumDailyBillsByItemRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SumDailyBillsByItemRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public SumDailyBillsByItemRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SumDailyBillsByItemRequest setStatsType(String statsType) {
        this.statsType = statsType;
        return this;
    }
    public String getStatsType() {
        return this.statsType;
    }

    public SumDailyBillsByItemRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
