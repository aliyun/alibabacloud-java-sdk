// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AccessTokenRequest extends TeaModel {
    @NameInMap("app_key")
    public String appKey;

    @NameInMap("app_secret")
    public String appSecret;

    public static AccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessTokenRequest self = new AccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public AccessTokenRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public AccessTokenRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

}
