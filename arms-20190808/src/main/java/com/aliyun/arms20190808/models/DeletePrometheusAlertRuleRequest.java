// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusAlertRuleRequest extends TeaModel {
    /**
     * <p>Indicates whether the alert rule was deleted. Valid values:</p>
     * <br>
     * <p>*   `true`: The alert rule was deleted.</p>
     * <p>*   `false`: The alert rule failed to be deleted.</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("ClusterId")
    public String clusterId;

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

    public DeletePrometheusAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
