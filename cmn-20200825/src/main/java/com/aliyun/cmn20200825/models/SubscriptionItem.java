// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class SubscriptionItem extends TeaModel {
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    @NameInMap("Language")
    public String language;

    @NameInMap("MonitorItemId")
    public String monitorItemId;

    @NameInMap("NotificationGroupId")
    public String notificationGroupId;

    @NameInMap("NotificationMode")
    public String notificationMode;

    @NameInMap("RecoveryNotice")
    public Integer recoveryNotice;

    @NameInMap("SubscriptionItemId")
    public String subscriptionItemId;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("SuppressionStrategy")
    public String suppressionStrategy;

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
