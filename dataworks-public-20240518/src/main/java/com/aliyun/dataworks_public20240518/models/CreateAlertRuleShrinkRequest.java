// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAlertRuleShrinkRequest extends TeaModel {
    /**
     * <p>Indicates whether the rule is enabled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xm_create_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration for the alert notification.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The ID of the Alibaba Cloud account used by the creator of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>279114181716147735</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The conditions for triggering the alert.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerCondition")
    public String triggerConditionShrink;

    public static CreateAlertRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRuleShrinkRequest self = new CreateAlertRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertRuleShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateAlertRuleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertRuleShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateAlertRuleShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateAlertRuleShrinkRequest setTriggerConditionShrink(String triggerConditionShrink) {
        this.triggerConditionShrink = triggerConditionShrink;
        return this;
    }
    public String getTriggerConditionShrink() {
        return this.triggerConditionShrink;
    }

}
