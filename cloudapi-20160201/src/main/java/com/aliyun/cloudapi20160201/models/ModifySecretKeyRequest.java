// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifySecretKeyRequest extends TeaModel {
    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("SecretKeyId")
    public String secretKeyId;

    @NameInMap("SecretKeyName")
    public String secretKeyName;

    @NameInMap("SecretValue")
    public String secretValue;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifySecretKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecretKeyRequest self = new ModifySecretKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecretKeyRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public ModifySecretKeyRequest setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    public ModifySecretKeyRequest setSecretKeyName(String secretKeyName) {
        this.secretKeyName = secretKeyName;
        return this;
    }
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

    public ModifySecretKeyRequest setSecretValue(String secretValue) {
        this.secretValue = secretValue;
        return this;
    }
    public String getSecretValue() {
        return this.secretValue;
    }

    public ModifySecretKeyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
