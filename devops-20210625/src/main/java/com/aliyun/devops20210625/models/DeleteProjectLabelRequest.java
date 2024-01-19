// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProjectLabelRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static DeleteProjectLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectLabelRequest self = new DeleteProjectLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectLabelRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteProjectLabelRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DeleteProjectLabelRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
