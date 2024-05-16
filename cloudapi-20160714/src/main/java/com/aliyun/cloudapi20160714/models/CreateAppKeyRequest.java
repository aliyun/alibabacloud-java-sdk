// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AppSecret")
    public String appSecret;

    public static CreateAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppKeyRequest self = new CreateAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppKeyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppKeyRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateAppKeyRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

}
