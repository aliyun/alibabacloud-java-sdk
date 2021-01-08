// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsOrganizationMembersRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("RealPk")
    public String realPk;

    public static DeleteDevopsOrganizationMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsOrganizationMembersRequest self = new DeleteDevopsOrganizationMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsOrganizationMembersRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DeleteDevopsOrganizationMembersRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteDevopsOrganizationMembersRequest setRealPk(String realPk) {
        this.realPk = realPk;
        return this;
    }
    public String getRealPk() {
        return this.realPk;
    }

}
