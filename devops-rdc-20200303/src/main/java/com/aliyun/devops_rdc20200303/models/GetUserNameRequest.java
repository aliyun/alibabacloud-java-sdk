// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetUserNameRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("UserId")
    public String userId;

    public static GetUserNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserNameRequest self = new GetUserNameRequest();
        return TeaModel.build(map, self);
    }

    public GetUserNameRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetUserNameRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
