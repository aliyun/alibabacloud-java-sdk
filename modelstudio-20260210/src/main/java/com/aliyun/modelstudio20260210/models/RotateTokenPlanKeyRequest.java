// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class RotateTokenPlanKeyRequest extends TeaModel {
    /**
     * <p>API Key ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ak_123456</p>
     */
    @NameInMap("ApiKeyId")
    public String apiKeyId;

    public static RotateTokenPlanKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        RotateTokenPlanKeyRequest self = new RotateTokenPlanKeyRequest();
        return TeaModel.build(map, self);
    }

    public RotateTokenPlanKeyRequest setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

}
