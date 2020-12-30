// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetCallMeasureSummaryReportRequest extends TeaModel {
    @NameInMap("IntervalType")
    public String intervalType;

    @NameInMap("Year")
    public Integer year;

    @NameInMap("Month")
    public Integer month;

    @NameInMap("Day")
    public Integer day;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetCallMeasureSummaryReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCallMeasureSummaryReportRequest self = new GetCallMeasureSummaryReportRequest();
        return TeaModel.build(map, self);
    }

    public GetCallMeasureSummaryReportRequest setIntervalType(String intervalType) {
        this.intervalType = intervalType;
        return this;
    }
    public String getIntervalType() {
        return this.intervalType;
    }

    public GetCallMeasureSummaryReportRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

    public GetCallMeasureSummaryReportRequest setMonth(Integer month) {
        this.month = month;
        return this;
    }
    public Integer getMonth() {
        return this.month;
    }

    public GetCallMeasureSummaryReportRequest setDay(Integer day) {
        this.day = day;
        return this;
    }
    public Integer getDay() {
        return this.day;
    }

    public GetCallMeasureSummaryReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetCallMeasureSummaryReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
