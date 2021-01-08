// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectSprintsRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListDevopsProjectSprintsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectSprintsRequest self = new ListDevopsProjectSprintsRequest();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectSprintsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListDevopsProjectSprintsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
