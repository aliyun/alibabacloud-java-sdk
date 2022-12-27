// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateDeployKeyRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("key")
    public String key;

    @NameInMap("title")
    public String title;

    @NameInMap("organizationId")
    public String organizationId;

    public static CreateDeployKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployKeyRequest self = new CreateDeployKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeployKeyRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateDeployKeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateDeployKeyRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDeployKeyRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
