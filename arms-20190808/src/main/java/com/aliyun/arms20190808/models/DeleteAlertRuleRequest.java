// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleRequest extends TeaModel {
    // 告警规则ID
    @NameInMap("AlertId")
    public Long alertId;

    public static DeleteAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRuleRequest self = new DeleteAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

}
