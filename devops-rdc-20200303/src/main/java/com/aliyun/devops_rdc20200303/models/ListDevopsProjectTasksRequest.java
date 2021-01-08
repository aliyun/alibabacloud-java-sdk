// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTasksRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectIds")
    public String projectIds;

    public static ListDevopsProjectTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTasksRequest self = new ListDevopsProjectTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTasksRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListDevopsProjectTasksRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

}
