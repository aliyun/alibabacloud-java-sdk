// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListCredentialsRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("UserPk")
    public String userPk;

    public static ListCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsRequest self = new ListCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public ListCredentialsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListCredentialsRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
