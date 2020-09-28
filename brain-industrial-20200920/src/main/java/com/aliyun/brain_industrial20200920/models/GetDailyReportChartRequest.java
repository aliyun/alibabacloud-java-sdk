// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportChartRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("ReportDate")
    public String reportDate;

    public static GetDailyReportChartRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportChartRequest self = new GetDailyReportChartRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyReportChartRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public GetDailyReportChartRequest setReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public String getReportDate() {
        return this.reportDate;
    }

}
