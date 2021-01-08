// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteCommonGroupRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("CommonGroupId")
    public String commonGroupId;

    public static DeleteCommonGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonGroupRequest self = new DeleteCommonGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommonGroupRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DeleteCommonGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteCommonGroupRequest setCommonGroupId(String commonGroupId) {
        this.commonGroupId = commonGroupId;
        return this;
    }
    public String getCommonGroupId() {
        return this.commonGroupId;
    }

}
