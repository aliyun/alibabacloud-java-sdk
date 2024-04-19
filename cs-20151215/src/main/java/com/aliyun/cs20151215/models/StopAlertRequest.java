// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StopAlertRequest extends TeaModel {
    /**
     * <p>The name of the alert rule set to be disabled.</p>
     */
    @NameInMap("alert_rule_group_name")
    public String alertRuleGroupName;

    /**
     * <p>The name of the alert rule to be disabled. If you do not specify an alert rule name, the alert rule set is disabled.</p>
     */
    @NameInMap("alert_rule_name")
    public String alertRuleName;

    public static StopAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAlertRequest self = new StopAlertRequest();
        return TeaModel.build(map, self);
    }

    public StopAlertRequest setAlertRuleGroupName(String alertRuleGroupName) {
        this.alertRuleGroupName = alertRuleGroupName;
        return this;
    }
    public String getAlertRuleGroupName() {
        return this.alertRuleGroupName;
    }

    public StopAlertRequest setAlertRuleName(String alertRuleName) {
        this.alertRuleName = alertRuleName;
        return this;
    }
    public String getAlertRuleName() {
        return this.alertRuleName;
    }

}
