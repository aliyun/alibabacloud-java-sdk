// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConsumerAPIKey extends TeaModel {
    /**
     * <p>密钥是否启用，true表示启用，false表示禁用</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>消费者API密钥的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("consumerApiKeyId")
    public String consumerApiKeyId;

    /**
     * <p>消费者API密钥的创建时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>消费者API密钥的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>用于生产环境的API密钥</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>消费者API密钥最后一次更新的时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>API密钥的掩码展示形式，仅显示前后几位字符</p>
     * 
     * <strong>example:</strong>
     * <p>sk-****1234</p>
     */
    @NameInMap("maskedKey")
    public String maskedKey;

    /**
     * <p>关联的模型连接标识符</p>
     * 
     * <strong>example:</strong>
     * <p>mc-1234567890abcdef</p>
     */
    @NameInMap("modelConnectionId")
    public String modelConnectionId;

    public static ConsumerAPIKey build(java.util.Map<String, ?> map) throws Exception {
        ConsumerAPIKey self = new ConsumerAPIKey();
        return TeaModel.build(map, self);
    }

    public ConsumerAPIKey setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public ConsumerAPIKey setConsumerApiKeyId(String consumerApiKeyId) {
        this.consumerApiKeyId = consumerApiKeyId;
        return this;
    }
    public String getConsumerApiKeyId() {
        return this.consumerApiKeyId;
    }

    public ConsumerAPIKey setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ConsumerAPIKey setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConsumerAPIKey setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public ConsumerAPIKey setMaskedKey(String maskedKey) {
        this.maskedKey = maskedKey;
        return this;
    }
    public String getMaskedKey() {
        return this.maskedKey;
    }

    public ConsumerAPIKey setModelConnectionId(String modelConnectionId) {
        this.modelConnectionId = modelConnectionId;
        return this;
    }
    public String getModelConnectionId() {
        return this.modelConnectionId;
    }

}
