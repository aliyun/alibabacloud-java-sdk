// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("memberType")
    public String memberType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static DeleteRepositoryMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberRequest self = new DeleteRepositoryMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteRepositoryMemberRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

    public DeleteRepositoryMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
