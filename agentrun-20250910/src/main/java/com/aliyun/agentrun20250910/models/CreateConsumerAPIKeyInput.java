// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateConsumerAPIKeyInput extends TeaModel {
    /**
     * <p>用户自定义的完整API密钥；为空时由服务自动生成</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>消费者API密钥的描述信息，用于说明该密钥的用途</p>
     * 
     * <strong>example:</strong>
     * <p>用于生产环境的API密钥</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>关联的模型连接标识符</p>
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
