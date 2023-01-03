// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusAlertRuleRequest extends TeaModel {
    // The ID of the alert rule. You can call the ListPrometheusAlertRules operation to query the ID of the alert rule.
    @NameInMap("AlertId")
    public Long alertId;

    public static DeletePrometheusAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusAlertRuleRequest self = new DeletePrometheusAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

}
