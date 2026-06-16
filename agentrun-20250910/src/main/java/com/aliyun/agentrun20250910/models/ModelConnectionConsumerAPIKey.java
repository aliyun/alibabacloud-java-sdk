// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelConnectionConsumerAPIKey extends TeaModel {
    /**
     * <p>The unique identifier for the consumer API key.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("apiKeyId")
    public String apiKeyId;

    /**
     * <p>The value of the consumer API key.</p>
     */
    @NameInMap("value")
    public String value;

    public static ModelConnectionConsumerAPIKey build(java.util.Map<String, ?> map) throws Exception {
        ModelConnectionConsumerAPIKey self = new ModelConnectionConsumerAPIKey();
        return TeaModel.build(map, self);
    }

    public ModelConnectionConsumerAPIKey setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelConnectionConsumerAPIKey setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
