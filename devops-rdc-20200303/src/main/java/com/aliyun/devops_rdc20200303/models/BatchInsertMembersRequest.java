// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class BatchInsertMembersRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Members")
    public String members;

    @NameInMap("RealPk")
    public String realPk;

    public static BatchInsertMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchInsertMembersRequest self = new BatchInsertMembersRequest();
        return TeaModel.build(map, self);
    }

    public BatchInsertMembersRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public BatchInsertMembersRequest setMembers(String members) {
        this.members = members;
        return this;
    }
    public String getMembers() {
        return this.members;
    }

    public BatchInsertMembersRequest setRealPk(String realPk) {
        this.realPk = realPk;
        return this;
    }
    public String getRealPk() {
        return this.realPk;
    }

}
