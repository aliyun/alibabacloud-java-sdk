// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetLastWorkspaceRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("RealPk")
    public String realPk;

    public static GetLastWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLastWorkspaceRequest self = new GetLastWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetLastWorkspaceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetLastWorkspaceRequest setRealPk(String realPk) {
        this.realPk = realPk;
        return this;
    }
    public String getRealPk() {
        return this.realPk;
    }

}
