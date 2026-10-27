// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartAlertRequest extends TeaModel {
    /**
     * <p>The name of the alert rule group.</p>
     * 
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("alert_rule_group_name")
    public String alertRuleGroupName;

    /**
     * <p>The name of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("alert_rule_name")
    public String alertRuleName;

    public static StartAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAlertRequest self = new StartAlertRequest();
        return TeaModel.build(map, self);
    }

    public StartAlertRequest setAlertRuleGroupName(String alertRuleGroupName) {
        this.alertRuleGroupName = alertRuleGroupName;
        return this;
    }
    public String getAlertRuleGroupName() {
        return this.alertRuleGroupName;
    }

    public StartAlertRequest setAlertRuleName(String alertRuleName) {
        this.alertRuleName = alertRuleName;
        return this;
    }
    public String getAlertRuleName() {
        return this.alertRuleName;
    }

}
