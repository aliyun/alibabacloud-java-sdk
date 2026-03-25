// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maas20260318.models;

import com.aliyun.tea.*;

public class DeleteApiKeyRequest extends TeaModel {
    /**
     * <p>API Key ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3952240</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    public static DeleteApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiKeyRequest self = new DeleteApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiKeyRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

}
