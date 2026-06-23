// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StopAlertRequest extends TeaModel {
    /**
     * <p>The alert rule group name.</p>
     * 
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("alert_rule_group_name")
    public String alertRuleGroupName;

    /**
     * <p>The alert rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>sample</p>
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
