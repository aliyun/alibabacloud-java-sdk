// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The task ID associated with the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The description of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the alert rule. By default, the alert rule is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The alert metric type. Valid values:</p>
     * <ul>
     * <li>Heartbeat: task status alert.</li>
     * <li>FailoverCount: failover count alert.</li>
     * <li>Delay: task latency alert.</li>
     * <li>DdlReport: DDL notification.</li>
     * <li>ResourceUtilization: resource group utilization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Heartbeat</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The name of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alartRule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The alert notification settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationSettings")
    public String notificationSettingsShrink;

    /**
     * <p>The list of alert trigger conditions. Multiple conditions are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerConditions")
    public String triggerConditionsShrink;

    public static CreateDIAlarmRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleShrinkRequest self = new CreateDIAlarmRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDIAlarmRuleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CreateDIAlarmRuleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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
