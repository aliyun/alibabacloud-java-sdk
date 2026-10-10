// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterRenewApiKeyRequest extends TeaModel {
    /**
     * <p>The new expiration time in RFC 3339 format. The time must be later than the current time. If this parameter is not specified or is set to null, the API key remains valid indefinitely. This parameter only modifies the validity period and does not change the enabled or disabled status.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00+08:00</p>
     */
    @NameInMap("expireAt")
    public String expireAt;

    public static ModelRouterRenewApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterRenewApiKeyRequest self = new ModelRouterRenewApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterRenewApiKeyRequest setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

}
