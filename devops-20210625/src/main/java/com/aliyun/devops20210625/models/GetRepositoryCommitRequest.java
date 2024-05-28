// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryCommitRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("showSignature")
    public Boolean showSignature;

    public static GetRepositoryCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryCommitRequest self = new GetRepositoryCommitRequest();
        return TeaModel.build(map, self);
    }

    public GetRepositoryCommitRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetRepositoryCommitRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetRepositoryCommitRequest setShowSignature(Boolean showSignature) {
        this.showSignature = showSignature;
        return this;
    }
    public Boolean getShowSignature() {
        return this.showSignature;
    }

}
