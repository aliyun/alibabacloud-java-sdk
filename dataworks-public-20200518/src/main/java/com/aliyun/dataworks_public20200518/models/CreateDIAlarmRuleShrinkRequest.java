// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationSettings")
    public String notificationSettingsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerConditions")
    public String triggerConditionsShrink;

    public static CreateDIAlarmRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleShrinkRequest self = new CreateDIAlarmRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDIAlarmRuleShrinkRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public CreateDIAlarmRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDIAlarmRuleShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateDIAlarmRuleShrinkRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public CreateDIAlarmRuleShrinkRequest setNotificationSettingsShrink(String notificationSettingsShrink) {
        this.notificationSettingsShrink = notificationSettingsShrink;
        return this;
    }
    public String getNotificationSettingsShrink() {
        return this.notificationSettingsShrink;
    }

    public CreateDIAlarmRuleShrinkRequest setTriggerConditionsShrink(String triggerConditionsShrink) {
        this.triggerConditionsShrink = triggerConditionsShrink;
        return this;
    }
    public String getTriggerConditionsShrink() {
        return this.triggerConditionsShrink;
    }

}
