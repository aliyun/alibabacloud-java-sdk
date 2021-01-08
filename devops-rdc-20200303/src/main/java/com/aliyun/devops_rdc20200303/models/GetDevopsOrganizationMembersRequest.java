// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsOrganizationMembersRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    public static GetDevopsOrganizationMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsOrganizationMembersRequest self = new GetDevopsOrganizationMembersRequest();
        return TeaModel.build(map, self);
    }

    public GetDevopsOrganizationMembersRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
