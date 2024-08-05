// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111053351</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>204203237</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <strong>example:</strong>
     * <p>6f0a4ad7918a4b41a57fc087d5b066d0</p>
     */
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
