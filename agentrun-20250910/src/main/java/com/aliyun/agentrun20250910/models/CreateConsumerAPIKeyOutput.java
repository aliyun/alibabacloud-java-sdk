// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateConsumerAPIKeyOutput extends TeaModel {
    /**
     * <p>密钥是否启用</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>完整的API密钥明文，仅在创建时返回一次，请妥善保存</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>消费者API密钥的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("consumerApiKeyId")
    public String consumerApiKeyId;

    /**
     * <p>创建时间，采用ISO 8601格式</p>
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
     * <p>更新时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>API密钥的掩码展示形式</p>
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

    public static CreateConsumerAPIKeyOutput build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAPIKeyOutput self = new CreateConsumerAPIKeyOutput();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAPIKeyOutput setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public CreateConsumerAPIKeyOutput setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateConsumerAPIKeyOutput setConsumerApiKeyId(String consumerApiKeyId) {
        this.consumerApiKeyId = consumerApiKeyId;
        return this;
    }
    public String getConsumerApiKeyId() {
        return this.consumerApiKeyId;
    }

    public CreateConsumerAPIKeyOutput setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateConsumerAPIKeyOutput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConsumerAPIKeyOutput setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public CreateConsumerAPIKeyOutput setMaskedKey(String maskedKey) {
        this.maskedKey = maskedKey;
        return this;
    }
    public String getMaskedKey() {
        return this.maskedKey;
    }

    public CreateConsumerAPIKeyOutput setModelConnectionId(String modelConnectionId) {
        this.modelConnectionId = modelConnectionId;
        return this;
    }
    public String getModelConnectionId() {
        return this.modelConnectionId;
    }

}
