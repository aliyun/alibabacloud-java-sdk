// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>105412</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>collection_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration for the alert notification.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The ID of the Alibaba Cloud account used by the owner of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>193379****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The alert triggering condition.</p>
     */
    @NameInMap("TriggerCondition")
    public String triggerConditionShrink;

    public static UpdateAlertRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleShrinkRequest self = new UpdateAlertRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRuleShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateAlertRuleShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAlertRuleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlertRuleShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public UpdateAlertRuleShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateAlertRuleShrinkRequest setTriggerConditionShrink(String triggerConditionShrink) {
        this.triggerConditionShrink = triggerConditionShrink;
        return this;
    }
    public String getTriggerConditionShrink() {
        return this.triggerConditionShrink;
    }

}
