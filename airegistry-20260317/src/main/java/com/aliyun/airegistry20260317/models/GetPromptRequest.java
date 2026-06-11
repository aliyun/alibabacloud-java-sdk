// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetPromptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-qa</p>
     */
    @NameInMap("PromptKey")
    public String promptKey;

    public static GetPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPromptRequest self = new GetPromptRequest();
        return TeaModel.build(map, self);
    }

    public GetPromptRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetPromptRequest setPromptKey(String promptKey) {
        this.promptKey = promptKey;
        return this;
    }
    public String getPromptKey() {
        return this.promptKey;
    }

}
