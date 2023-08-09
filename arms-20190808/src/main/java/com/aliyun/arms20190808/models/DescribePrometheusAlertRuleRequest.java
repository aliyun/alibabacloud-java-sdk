// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribePrometheusAlertRuleRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule. You can call the ListPrometheusAlertRules operation to query the ID of the alert rule.</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("ClusterId")
    public String clusterId;

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

    public DescribePrometheusAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
