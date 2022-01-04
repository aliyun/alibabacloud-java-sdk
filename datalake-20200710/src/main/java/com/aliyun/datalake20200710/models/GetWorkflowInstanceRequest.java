// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceRequest extends TeaModel {
    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    @NameInMap("ProjectId")
    public String projectId;

    public static GetWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceRequest self = new GetWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceRequest setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public GetWorkflowInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
