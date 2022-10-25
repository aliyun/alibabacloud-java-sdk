// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberWithExternUidRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("ExternUserId")
    public String externUserId;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static DeleteRepositoryMemberWithExternUidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberWithExternUidRequest self = new DeleteRepositoryMemberWithExternUidRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberWithExternUidRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteRepositoryMemberWithExternUidRequest setExternUserId(String externUserId) {
        this.externUserId = externUserId;
        return this;
    }
    public String getExternUserId() {
        return this.externUserId;
    }

    public DeleteRepositoryMemberWithExternUidRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
