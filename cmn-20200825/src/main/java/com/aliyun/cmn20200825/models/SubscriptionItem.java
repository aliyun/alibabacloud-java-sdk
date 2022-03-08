// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class SubscriptionItem extends TeaModel {
    // 告警状态
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    // 发送通知的语言
    @NameInMap("Language")
    public String language;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 通知组ID
    @NameInMap("NotificationGroupId")
    public String notificationGroupId;

    // 通知方式
    @NameInMap("NotificationMode")
    public String notificationMode;

    // 是否发送通知
    @NameInMap("RecoveryNotice")
    public Integer recoveryNotice;

    // 订阅项ID
    @NameInMap("SubscriptionItemId")
    public String subscriptionItemId;

    // 订阅类型
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    // 抑制策略
    @NameInMap("SuppressionStrategy")
    public String suppressionStrategy;

    // 连续触发次数
    @NameInMap("TriggerTimes")
    public Integer triggerTimes;

    public static SubscriptionItem build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionItem self = new SubscriptionItem();
        return TeaModel.build(map, self);
    }

    public SubscriptionItem setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    public SubscriptionItem setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SubscriptionItem setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public SubscriptionItem setNotificationGroupId(String notificationGroupId) {
        this.notificationGroupId = notificationGroupId;
        return this;
    }
    public String getNotificationGroupId() {
        return this.notificationGroupId;
    }

    public SubscriptionItem setNotificationMode(String notificationMode) {
        this.notificationMode = notificationMode;
        return this;
    }
    public String getNotificationMode() {
        return this.notificationMode;
    }

    public SubscriptionItem setRecoveryNotice(Integer recoveryNotice) {
        this.recoveryNotice = recoveryNotice;
        return this;
    }
    public Integer getRecoveryNotice() {
        return this.recoveryNotice;
    }

    public SubscriptionItem setSubscriptionItemId(String subscriptionItemId) {
        this.subscriptionItemId = subscriptionItemId;
        return this;
    }
    public String getSubscriptionItemId() {
        return this.subscriptionItemId;
    }

    public SubscriptionItem setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public SubscriptionItem setSuppressionStrategy(String suppressionStrategy) {
        this.suppressionStrategy = suppressionStrategy;
        return this;
    }
    public String getSuppressionStrategy() {
        return this.suppressionStrategy;
    }

    public SubscriptionItem setTriggerTimes(Integer triggerTimes) {
        this.triggerTimes = triggerTimes;
        return this;
    }
    public Integer getTriggerTimes() {
        return this.triggerTimes;
    }

}
