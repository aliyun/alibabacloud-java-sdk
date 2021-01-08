// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ScType")
    public String scType;

    @NameInMap("UserPk")
    public String userPk;

    public static ListServiceConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsRequest self = new ListServiceConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListServiceConnectionsRequest setScType(String scType) {
        this.scType = scType;
        return this;
    }
    public String getScType() {
        return this.scType;
    }

    public ListServiceConnectionsRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
