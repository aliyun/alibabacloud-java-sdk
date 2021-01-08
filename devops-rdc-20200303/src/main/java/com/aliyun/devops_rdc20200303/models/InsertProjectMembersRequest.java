// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class InsertProjectMembersRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Members")
    public String members;

    public static InsertProjectMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertProjectMembersRequest self = new InsertProjectMembersRequest();
        return TeaModel.build(map, self);
    }

    public InsertProjectMembersRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public InsertProjectMembersRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public InsertProjectMembersRequest setMembers(String members) {
        this.members = members;
        return this;
    }
    public String getMembers() {
        return this.members;
    }

}
