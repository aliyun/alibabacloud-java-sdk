// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetSummaryReportChartRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    public static GetSummaryReportChartRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryReportChartRequest self = new GetSummaryReportChartRequest();
        return TeaModel.build(map, self);
    }

    public GetSummaryReportChartRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public GetSummaryReportChartRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetSummaryReportChartRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
