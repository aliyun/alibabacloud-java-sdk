// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ResetAppKeySecretRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ResetAppKeySecretRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppKeySecretRequest self = new ResetAppKeySecretRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppKeySecretRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ResetAppKeySecretRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
