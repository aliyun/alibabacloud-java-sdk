// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ResetAppSecretRequest extends TeaModel {
    /**
     * <p>The key of the application that is used to make an API call.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The new AppKey that you set must be globally unique.</p>
     */
    @NameInMap("NewAppKey")
    public String newAppKey;

    /**
     * <p>The new key of the application. To improve compatibility, we recommend that you use other parameters.</p>
     */
    @NameInMap("NewAppSecret")
    public String newAppSecret;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ResetAppSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppSecretRequest self = new ResetAppSecretRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppSecretRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ResetAppSecretRequest setNewAppKey(String newAppKey) {
        this.newAppKey = newAppKey;
        return this;
    }
    public String getNewAppKey() {
        return this.newAppKey;
    }

    public ResetAppSecretRequest setNewAppSecret(String newAppSecret) {
        this.newAppSecret = newAppSecret;
        return this;
    }
    public String getNewAppSecret() {
        return this.newAppSecret;
    }

    public ResetAppSecretRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
