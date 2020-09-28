// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportInfoRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("ReportDate")
    public String reportDate;

    public static GetDailyReportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportInfoRequest self = new GetDailyReportInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyReportInfoRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public GetDailyReportInfoRequest setReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public String getReportDate() {
        return this.reportDate;
    }

}
