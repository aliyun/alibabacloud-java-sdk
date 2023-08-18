// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("organizationId")
    public String organizationId;

    public static GetMergeRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestRequest self = new GetMergeRequestRequest();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetMergeRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
