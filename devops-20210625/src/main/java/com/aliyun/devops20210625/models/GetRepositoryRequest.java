// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryRequest extends TeaModel {
    // 个人访问令牌
    @NameInMap("accessToken")
    public String accessToken;

    // 代码库ID或路径
    @NameInMap("identity")
    public String identity;

    // 企业ID
    @NameInMap("organizationId")
    public String organizationId;

    public static GetRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryRequest self = new GetRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public GetRepositoryRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetRepositoryRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public GetRepositoryRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
