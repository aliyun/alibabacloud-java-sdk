// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryProtectedBranchRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static CreateRepositoryProtectedBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryProtectedBranchRequest self = new CreateRepositoryProtectedBranchRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryProtectedBranchRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateRepositoryProtectedBranchRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
