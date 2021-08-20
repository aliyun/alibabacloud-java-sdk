// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class EnableRepositoryDeployKeyRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("SubUserId")
    public String subUserId;

    public static EnableRepositoryDeployKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRepositoryDeployKeyRequest self = new EnableRepositoryDeployKeyRequest();
        return TeaModel.build(map, self);
    }

    public EnableRepositoryDeployKeyRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public EnableRepositoryDeployKeyRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public EnableRepositoryDeployKeyRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
