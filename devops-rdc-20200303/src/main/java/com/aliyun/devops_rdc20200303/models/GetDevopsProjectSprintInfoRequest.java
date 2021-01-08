// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectSprintInfoRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("SprintId")
    public String sprintId;

    public static GetDevopsProjectSprintInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectSprintInfoRequest self = new GetDevopsProjectSprintInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectSprintInfoRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDevopsProjectSprintInfoRequest setSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public String getSprintId() {
        return this.sprintId;
    }

}
