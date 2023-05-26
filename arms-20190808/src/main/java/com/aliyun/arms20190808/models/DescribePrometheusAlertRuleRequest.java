// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribePrometheusAlertRuleRequest extends TeaModel {
    @NameInMap("AlertId")
    public Long alertId;

    public static DescribePrometheusAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrometheusAlertRuleRequest self = new DescribePrometheusAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrometheusAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

}
