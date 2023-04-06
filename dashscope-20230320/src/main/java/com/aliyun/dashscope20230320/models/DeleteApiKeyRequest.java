// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class DeleteApiKeyRequest extends TeaModel {
    @NameInMap("ApiKeyId")
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
