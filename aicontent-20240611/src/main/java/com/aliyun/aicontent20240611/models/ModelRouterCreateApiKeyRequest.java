// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateApiKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    public static ModelRouterCreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateApiKeyRequest self = new ModelRouterCreateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateApiKeyRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

}
