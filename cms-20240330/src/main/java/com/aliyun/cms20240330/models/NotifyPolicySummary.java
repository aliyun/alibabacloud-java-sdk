// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyPolicySummary extends TeaModel {
    /**
     * <p>The creation time, represented as a UNIX millisecond timestamp string.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000000</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>A notification policy for testing</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the notification policy is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The Policy Name of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample notification policy</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The configuration details of the notification policy.</p>
     */
    @NameInMap("notifyStrategy")
    public NotifyStrategyDetail notifyStrategy;

    /**
     * <p>The update time, represented as a UNIX millisecond timestamp string.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000000</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The Alibaba Cloud account UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The unique identifier of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>ns-uuid-001</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The version number of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Integer version;

    /**
     * <p>The workspace identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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
