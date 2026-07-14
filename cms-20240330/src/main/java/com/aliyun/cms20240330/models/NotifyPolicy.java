// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyPolicy extends TeaModel {
    /**
     * <p>The creation time. The value is a UNIX timestamp string in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1710000000000</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>生产环境告警通知策略</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the policy is enabled. This is a read-only field controlled by the Enable or Disable operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>生产环境告警通知策略</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The notification policy sub-entity details.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("notifyStrategy")
    public NotifyStrategyDetail notifyStrategy;

    /**
     * <p>The response plan sub-entity details.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("responsePlan")
    public ResponsePlanDetail responsePlan;

    /**
     * <p>The subscription sub-entity details.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("subscription")
    public SubscriptionDetail subscription;

    /**
     * <p>The update time. The value is a UNIX timestamp string in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1710000000000</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The Alibaba Cloud account UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The unique identifier of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>04779a183add4f2ca06ab440f16cc580</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The optimistic locking version number.</p>
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
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static NotifyPolicy build(java.util.Map<String, ?> map) throws Exception {
        NotifyPolicy self = new NotifyPolicy();
        return TeaModel.build(map, self);
    }

    public NotifyPolicy setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NotifyPolicy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyPolicy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public NotifyPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NotifyPolicy setNotifyStrategy(NotifyStrategyDetail notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public NotifyStrategyDetail getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public NotifyPolicy setResponsePlan(ResponsePlanDetail responsePlan) {
        this.responsePlan = responsePlan;
        return this;
    }
    public ResponsePlanDetail getResponsePlan() {
        return this.responsePlan;
    }

    public NotifyPolicy setSubscription(SubscriptionDetail subscription) {
        this.subscription = subscription;
        return this;
    }
    public SubscriptionDetail getSubscription() {
        return this.subscription;
    }

    public NotifyPolicy setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NotifyPolicy setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public NotifyPolicy setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public NotifyPolicy setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public NotifyPolicy setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
