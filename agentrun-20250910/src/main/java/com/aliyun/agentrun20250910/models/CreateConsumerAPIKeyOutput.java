// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateConsumerAPIKeyOutput extends TeaModel {
    /**
     * <p>Indicates whether the consumer API key is active.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>The complete plaintext API key. This key is returned only upon creation and cannot be retrieved again. Store it securely.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>The unique identifier of the consumer API key.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("consumerApiKeyId")
    public String consumerApiKeyId;

    /**
     * <p>The creation time, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>A description of the consumer API key.</p>
     * 
     * <strong>example:</strong>
     * <p>用于生产环境的API密钥</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The last update time, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>A masked version of the API key for display purposes.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-****1234</p>
     */
    @NameInMap("maskedKey")
    public String maskedKey;

    /**
     * <p>The associated model connection identifier.</p>
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
