// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectTaskInfoRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetDevopsProjectTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectTaskInfoRequest self = new GetDevopsProjectTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectTaskInfoRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDevopsProjectTaskInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
