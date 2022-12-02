// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class NotificationGroup extends TeaModel {
    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("NotificationGroupDescription")
    public String notificationGroupDescription;

    @NameInMap("NotificationGroupId")
    public String notificationGroupId;

    @NameInMap("NotificationGroupName")
    public String notificationGroupName;

    @NameInMap("NotificationGroupType")
    public String notificationGroupType;

    @NameInMap("Webhook")
    public String webhook;

    public static NotificationGroup build(java.util.Map<String, ?> map) throws Exception {
        NotificationGroup self = new NotificationGroup();
        return TeaModel.build(map, self);
    }

    public NotificationGroup setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public NotificationGroup setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public NotificationGroup setNotificationGroupDescription(String notificationGroupDescription) {
        this.notificationGroupDescription = notificationGroupDescription;
        return this;
    }
    public String getNotificationGroupDescription() {
        return this.notificationGroupDescription;
    }

    public NotificationGroup setNotificationGroupId(String notificationGroupId) {
        this.notificationGroupId = notificationGroupId;
        return this;
    }
    public String getNotificationGroupId() {
        return this.notificationGroupId;
    }

    public NotificationGroup setNotificationGroupName(String notificationGroupName) {
        this.notificationGroupName = notificationGroupName;
        return this;
    }
    public String getNotificationGroupName() {
        return this.notificationGroupName;
    }

    public NotificationGroup setNotificationGroupType(String notificationGroupType) {
        this.notificationGroupType = notificationGroupType;
        return this;
    }
    public String getNotificationGroupType() {
        return this.notificationGroupType;
    }

    public NotificationGroup setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
