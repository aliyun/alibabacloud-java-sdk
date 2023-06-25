// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateUserKeyRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("keyScope")
    public String keyScope;

    @NameInMap("publicKey")
    public String publicKey;

    @NameInMap("title")
    public String title;

    @NameInMap("organizationId")
    public String organizationId;

    public static CreateUserKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserKeyRequest self = new CreateUserKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserKeyRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateUserKeyRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateUserKeyRequest setKeyScope(String keyScope) {
        this.keyScope = keyScope;
        return this;
    }
    public String getKeyScope() {
        return this.keyScope;
    }

    public CreateUserKeyRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public CreateUserKeyRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateUserKeyRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
