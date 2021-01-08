// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateServiceConnectionRequest extends TeaModel {
    @NameInMap("ServiceConnectionType")
    public String serviceConnectionType;

    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("OrgId")
    public String orgId;

    public static CreateServiceConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceConnectionRequest self = new CreateServiceConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceConnectionRequest setServiceConnectionType(String serviceConnectionType) {
        this.serviceConnectionType = serviceConnectionType;
        return this;
    }
    public String getServiceConnectionType() {
        return this.serviceConnectionType;
    }

    public CreateServiceConnectionRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public CreateServiceConnectionRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
