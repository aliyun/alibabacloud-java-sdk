// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class CreateSecretKeyRequest extends TeaModel {
    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("SecretKeyName")
    public String secretKeyName;

    @NameInMap("SecretValue")
    public String secretValue;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateSecretKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretKeyRequest self = new CreateSecretKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretKeyRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public CreateSecretKeyRequest setSecretKeyName(String secretKeyName) {
        this.secretKeyName = secretKeyName;
        return this;
    }
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

    public CreateSecretKeyRequest setSecretValue(String secretValue) {
        this.secretValue = secretValue;
        return this;
    }
    public String getSecretValue() {
        return this.secretValue;
    }

    public CreateSecretKeyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
