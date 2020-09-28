// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetDailyReportPidParamRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("PidReportDate")
    public String pidReportDate;

    public static GetDailyReportPidParamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyReportPidParamRequest self = new GetDailyReportPidParamRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyReportPidParamRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public GetDailyReportPidParamRequest setPidReportDate(String pidReportDate) {
        this.pidReportDate = pidReportDate;
        return this;
    }
    public String getPidReportDate() {
        return this.pidReportDate;
    }

}
