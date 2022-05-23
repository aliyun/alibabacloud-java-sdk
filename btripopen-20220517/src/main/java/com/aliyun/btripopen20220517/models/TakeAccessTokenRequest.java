// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220517.models;

import com.aliyun.tea.*;

public class TakeAccessTokenRequest extends TeaModel {
    @NameInMap("app_key")
    public String appKey;

    @NameInMap("app_secret")
    public String appSecret;

    public static TakeAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        TakeAccessTokenRequest self = new TakeAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public TakeAccessTokenRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public TakeAccessTokenRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

}
