// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class IMBotInfo extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    @NameInMap("botBizId")
    public String botBizId;

    /**
     * <p>dingtalk、wecom、feishu、custom</p>
     */
    @NameInMap("botBizType")
    public String botBizType;

    /**
     * <p>standard、custom</p>
     */
    @NameInMap("botMode")
    public String botMode;

    @NameInMap("botName")
    public String botName;

    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>可选；来自账号元数据 scaling.currentInstances，同一租户下各 Bot 响应中值相同</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("currentInstances")
    public Long currentInstances;

    /**
     * <p>Bot 描述信息</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public String id;

    @NameInMap("imChannelServerResourceName")
    public String imChannelServerResourceName;

    /**
     * <p>可选</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("lastMessageTime")
    public String lastMessageTime;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("metadata")
    public IMBotMetadata metadata;

    @NameInMap("status")
    public String status;

    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static IMBotInfo build(java.util.Map<String, ?> map) throws Exception {
        IMBotInfo self = new IMBotInfo();
        return TeaModel.build(map, self);
    }

    public IMBotInfo setAgentRuntimeId(String agentRuntimeId) {
        this.agentRuntimeId = agentRuntimeId;
        return this;
    }
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    public IMBotInfo setBotBizId(String botBizId) {
        this.botBizId = botBizId;
        return this;
    }
    public String getBotBizId() {
        return this.botBizId;
    }

    public IMBotInfo setBotBizType(String botBizType) {
        this.botBizType = botBizType;
        return this;
    }
    public String getBotBizType() {
        return this.botBizType;
    }

    public IMBotInfo setBotMode(String botMode) {
        this.botMode = botMode;
        return this;
    }
    public String getBotMode() {
        return this.botMode;
    }

    public IMBotInfo setBotName(String botName) {
        this.botName = botName;
        return this;
    }
    public String getBotName() {
        return this.botName;
    }

    public IMBotInfo setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public IMBotInfo setCurrentInstances(Long currentInstances) {
        this.currentInstances = currentInstances;
        return this;
    }
    public Long getCurrentInstances() {
        return this.currentInstances;
    }

    public IMBotInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IMBotInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IMBotInfo setImChannelServerResourceName(String imChannelServerResourceName) {
        this.imChannelServerResourceName = imChannelServerResourceName;
        return this;
    }
    public String getImChannelServerResourceName() {
        return this.imChannelServerResourceName;
    }

    public IMBotInfo setLastMessageTime(String lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
        return this;
    }
    public String getLastMessageTime() {
        return this.lastMessageTime;
    }

    public IMBotInfo setMetadata(IMBotMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public IMBotMetadata getMetadata() {
        return this.metadata;
    }

    public IMBotInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IMBotInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IMBotInfo setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
