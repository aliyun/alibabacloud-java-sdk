// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetProjectMemberRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("repositoryId")
    public Long repositoryId;

    @NameInMap("userAliyunPk")
    public String userAliyunPk;

    public static GetProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMemberRequest self = new GetProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetProjectMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetProjectMemberRequest setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    public GetProjectMemberRequest setUserAliyunPk(String userAliyunPk) {
        this.userAliyunPk = userAliyunPk;
        return this;
    }
    public String getUserAliyunPk() {
        return this.userAliyunPk;
    }

}
