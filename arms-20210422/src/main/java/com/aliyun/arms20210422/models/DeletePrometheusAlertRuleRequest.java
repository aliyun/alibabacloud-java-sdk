// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeletePrometheusAlertRuleRequest extends TeaModel {
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
