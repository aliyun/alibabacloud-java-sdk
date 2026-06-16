// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateConsumerAPIKeyInput extends TeaModel {
    /**
     * <p>A custom API key. If omitted, the service generates one automatically.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>A description for the consumer API key.</p>
     * 
     * <strong>example:</strong>
     * <p>用于生产环境的API密钥</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The identifier for the model connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-1234567890abcdef</p>
     */
    @NameInMap("modelConnectionId")
    public String modelConnectionId;

    public static CreateConsumerAPIKeyInput build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAPIKeyInput self = new CreateConsumerAPIKeyInput();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAPIKeyInput setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateConsumerAPIKeyInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConsumerAPIKeyInput setModelConnectionId(String modelConnectionId) {
        this.modelConnectionId = modelConnectionId;
        return this;
    }
    public String getModelConnectionId() {
        return this.modelConnectionId;
    }

}
