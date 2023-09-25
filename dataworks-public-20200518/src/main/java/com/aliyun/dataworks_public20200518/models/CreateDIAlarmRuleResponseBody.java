// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleResponseBody extends TeaModel {
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleResponseBody self = new CreateDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDIAlarmRuleResponseBody setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public CreateDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
