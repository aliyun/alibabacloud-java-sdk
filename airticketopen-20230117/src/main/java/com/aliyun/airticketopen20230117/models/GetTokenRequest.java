// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GetTokenRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fu1bltcu3400iurywuri</p>
     */
    @NameInMap("app_key")
    public String appKey;

    /**
     * <p>appSecret</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZzQ3MW1mb3E1ODAwI2ldUjYlWUdJn5YI</p>
     */
    @NameInMap("app_secret")
    public String appSecret;

    public static GetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenRequest self = new GetTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetTokenRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

}
