// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ResetAppSecretRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("AppKey")
    public String appKey;

    public static ResetAppSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppSecretRequest self = new ResetAppSecretRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppSecretRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ResetAppSecretRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
