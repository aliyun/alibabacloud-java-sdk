// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyPolicySummary extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("name")
    public String name;

    @NameInMap("notifyStrategy")
    public NotifyStrategyDetail notifyStrategy;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("userId")
    public String userId;

    @NameInMap("uuid")
    public String uuid;

    @NameInMap("version")
    public Integer version;

    @NameInMap("workspace")
    public String workspace;

    public static NotifyPolicySummary build(java.util.Map<String, ?> map) throws Exception {
        NotifyPolicySummary self = new NotifyPolicySummary();
        return TeaModel.build(map, self);
    }

    public NotifyPolicySummary setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NotifyPolicySummary setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyPolicySummary setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public NotifyPolicySummary setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NotifyPolicySummary setNotifyStrategy(NotifyStrategyDetail notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public NotifyStrategyDetail getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public NotifyPolicySummary setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NotifyPolicySummary setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public NotifyPolicySummary setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public NotifyPolicySummary setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public NotifyPolicySummary setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
