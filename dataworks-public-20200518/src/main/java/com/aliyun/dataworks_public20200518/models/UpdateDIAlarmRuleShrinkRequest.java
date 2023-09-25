// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIAlarmRuleShrinkRequest extends TeaModel {
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("NotificationSettings")
    public String notificationSettingsShrink;

    @NameInMap("TriggerConditions")
    public String triggerConditionsShrink;

    public static UpdateDIAlarmRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIAlarmRuleShrinkRequest self = new UpdateDIAlarmRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDIAlarmRuleShrinkRequest setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public UpdateDIAlarmRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDIAlarmRuleShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateDIAlarmRuleShrinkRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public UpdateDIAlarmRuleShrinkRequest setNotificationSettingsShrink(String notificationSettingsShrink) {
        this.notificationSettingsShrink = notificationSettingsShrink;
        return this;
    }
    public String getNotificationSettingsShrink() {
        return this.notificationSettingsShrink;
    }

    public UpdateDIAlarmRuleShrinkRequest setTriggerConditionsShrink(String triggerConditionsShrink) {
        this.triggerConditionsShrink = triggerConditionsShrink;
        return this;
    }
    public String getTriggerConditionsShrink() {
        return this.triggerConditionsShrink;
    }

}
