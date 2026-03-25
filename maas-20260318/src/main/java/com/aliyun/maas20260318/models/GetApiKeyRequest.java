// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maas20260318.models;

import com.aliyun.tea.*;

public class GetApiKeyRequest extends TeaModel {
    /**
     * <p>API Key ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3303332</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    public static GetApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiKeyRequest self = new GetApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetApiKeyRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

}
