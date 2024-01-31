// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCheckRunRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("checkRunId")
    public Long checkRunId;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static GetCheckRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckRunRequest self = new GetCheckRunRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckRunRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetCheckRunRequest setCheckRunId(Long checkRunId) {
        this.checkRunId = checkRunId;
        return this;
    }
    public Long getCheckRunId() {
        return this.checkRunId;
    }

    public GetCheckRunRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetCheckRunRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
