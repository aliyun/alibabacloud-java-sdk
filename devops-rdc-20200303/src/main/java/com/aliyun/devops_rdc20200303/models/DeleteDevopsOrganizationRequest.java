// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsOrganizationRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    public static DeleteDevopsOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsOrganizationRequest self = new DeleteDevopsOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsOrganizationRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
