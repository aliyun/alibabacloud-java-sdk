// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateMergeRequestRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("SubUserId")
    public String subUserId;

    public static CreateMergeRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestRequest self = new CreateMergeRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateMergeRequestRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateMergeRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateMergeRequestRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
