// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateMemberApiKeyRequest extends TeaModel {
    /**
     * <p>The expiration time in the format of yyyy-MM-dd HH:mm:ss. This parameter is optional. If not specified, the key is permanently valid.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-07-31 00:00:00</p>
     */
    @NameInMap("expireAt")
    public String expireAt;

    /**
     * <p>The name of the API key. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>TestKey</p>
     */
    @NameInMap("name")
    public String name;

    public static ModelRouterCreateMemberApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateMemberApiKeyRequest self = new ModelRouterCreateMemberApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateMemberApiKeyRequest setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public ModelRouterCreateMemberApiKeyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
