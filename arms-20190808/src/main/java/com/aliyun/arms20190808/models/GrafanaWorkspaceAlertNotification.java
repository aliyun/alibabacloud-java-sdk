// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceAlertNotification extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isArms")
    public Boolean isArms;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isDefault")
    public Boolean isDefault;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("sendReminder")
    public Boolean sendReminder;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("settings")
    public String settings;

    /**
     * <strong>example:</strong>
     * <p>Email</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>Xfdf******</p>
     */
    @NameInMap("uid")
    public String uid;

    public static GrafanaWorkspaceAlertNotification build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceAlertNotification self = new GrafanaWorkspaceAlertNotification();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceAlertNotification setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceAlertNotification setIsArms(Boolean isArms) {
        this.isArms = isArms;
        return this;
    }
    public Boolean getIsArms() {
        return this.isArms;
    }

    public GrafanaWorkspaceAlertNotification setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public GrafanaWorkspaceAlertNotification setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GrafanaWorkspaceAlertNotification setSendReminder(Boolean sendReminder) {
        this.sendReminder = sendReminder;
        return this;
    }
    public Boolean getSendReminder() {
        return this.sendReminder;
    }

    public GrafanaWorkspaceAlertNotification setSettings(String settings) {
        this.settings = settings;
        return this;
    }
    public String getSettings() {
        return this.settings;
    }

    public GrafanaWorkspaceAlertNotification setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GrafanaWorkspaceAlertNotification setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
