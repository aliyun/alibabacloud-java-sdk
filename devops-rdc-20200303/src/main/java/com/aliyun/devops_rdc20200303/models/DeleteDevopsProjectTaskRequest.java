// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsProjectTaskRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("TaskId")
    public String taskId;

    public static DeleteDevopsProjectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsProjectTaskRequest self = new DeleteDevopsProjectTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsProjectTaskRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DeleteDevopsProjectTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
