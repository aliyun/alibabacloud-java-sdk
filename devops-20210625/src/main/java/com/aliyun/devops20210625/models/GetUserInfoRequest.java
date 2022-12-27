// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetUserInfoRequest extends TeaModel {
    @NameInMap("organizationId")
    public String organizationId;

    public static GetUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoRequest self = new GetUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserInfoRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
