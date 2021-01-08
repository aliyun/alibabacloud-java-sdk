// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryInfoRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static GetRepositoryInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryInfoRequest self = new GetRepositoryInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetRepositoryInfoRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetRepositoryInfoRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public GetRepositoryInfoRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
