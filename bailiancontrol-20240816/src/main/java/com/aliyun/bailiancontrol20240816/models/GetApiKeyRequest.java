// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailiancontrol20240816.models;

import com.aliyun.tea.*;

public class GetApiKeyRequest extends TeaModel {
    @NameInMap("apiKeyId")
    public String apiKeyId;

    public static GetApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiKeyRequest self = new GetApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetApiKeyRequest setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

}
