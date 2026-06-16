// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConsumerAPIKey extends TeaModel {
    /**
     * <p>Specifies if the key is enabled (true) or disabled (false).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>The unique identifier of the consumer API key.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("consumerApiKeyId")
    public String consumerApiKeyId;

    /**
     * <p>The creation time of the consumer API key, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>A user-defined description for the consumer API key.</p>
     * 
     * <strong>example:</strong>
     * <p>用于生产环境的API密钥</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The last update time of the consumer API key, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The masked API key, showing only the first and last few characters.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-****1234</p>
     */
    @NameInMap("maskedKey")
    public String maskedKey;

    /**
     * <p>The identifier of the associated model connection.</p>
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
