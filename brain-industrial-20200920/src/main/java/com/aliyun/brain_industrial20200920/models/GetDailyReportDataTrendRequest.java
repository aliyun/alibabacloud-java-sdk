// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportDataTrendRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("ReportDate")
    public String reportDate;

    public static GetDailyReportDataTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportDataTrendRequest self = new GetDailyReportDataTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyReportDataTrendRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public GetDailyReportDataTrendRequest setReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public String getReportDate() {
        return this.reportDate;
    }

}
