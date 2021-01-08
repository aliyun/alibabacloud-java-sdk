// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskDetailBaseRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetTaskDetailBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailBaseRequest self = new GetTaskDetailBaseRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailBaseRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetTaskDetailBaseRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetTaskDetailBaseRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
