// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetSummaryReportDataTrendRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TrendType")
    @Validation(required = true)
    public String trendType;

    public static GetSummaryReportDataTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryReportDataTrendRequest self = new GetSummaryReportDataTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetSummaryReportDataTrendRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public GetSummaryReportDataTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetSummaryReportDataTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetSummaryReportDataTrendRequest setTrendType(String trendType) {
        this.trendType = trendType;
        return this;
    }
    public String getTrendType() {
        return this.trendType;
    }

}
