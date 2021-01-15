// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class NotificationGroup extends TeaModel {
    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 描述
    @NameInMap("NotificationGroupDescription")
    public String notificationGroupDescription;

    // 通知组ID
    @NameInMap("NotificationGroupId")
    public String notificationGroupId;

    // 通知组名称
    @NameInMap("NotificationGroupName")
    public String notificationGroupName;

    // 通知组类型
    @NameInMap("NotificationGroupType")
    public String notificationGroupType;

    // 钉钉群webhook
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
