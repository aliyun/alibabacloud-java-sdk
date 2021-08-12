// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetWorkflowStatusRequest extends TeaModel {
    // ENUM:["CreateCluster","DeleteCluster","Pack","Deploy"]
    @NameInMap("workflowType")
    public String workflowType;

    public static GetWorkflowStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowStatusRequest self = new GetWorkflowStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowStatusRequest setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    public String getWorkflowType() {
        return this.workflowType;
    }

}
