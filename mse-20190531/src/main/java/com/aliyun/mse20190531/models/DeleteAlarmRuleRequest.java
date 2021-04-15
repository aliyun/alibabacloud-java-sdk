// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteAlarmRuleRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("AlarmRuleId")
    public String alarmRuleId;

    public static DeleteAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmRuleRequest self = new DeleteAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmRuleRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public DeleteAlarmRuleRequest setAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public String getAlarmRuleId() {
        return this.alarmRuleId;
    }

}
