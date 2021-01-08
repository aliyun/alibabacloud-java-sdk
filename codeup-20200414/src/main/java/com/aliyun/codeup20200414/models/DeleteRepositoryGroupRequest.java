// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryGroupRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("SubUserId")
    public String subUserId;

    public static DeleteRepositoryGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryGroupRequest self = new DeleteRepositoryGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryGroupRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteRepositoryGroupRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DeleteRepositoryGroupRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
