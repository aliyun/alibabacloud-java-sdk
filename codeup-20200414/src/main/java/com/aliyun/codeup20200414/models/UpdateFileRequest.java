// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("SubUserId")
    public String subUserId;

    public static UpdateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileRequest self = new UpdateFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateFileRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UpdateFileRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
