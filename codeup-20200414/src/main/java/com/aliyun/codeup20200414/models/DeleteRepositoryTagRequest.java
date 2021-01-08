// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryTagRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static DeleteRepositoryTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryTagRequest self = new DeleteRepositoryTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryTagRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteRepositoryTagRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
