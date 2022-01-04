// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMigrationWorkflowInstanceLogInfoRequest extends TeaModel {
    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    public static GetMigrationWorkflowInstanceLogInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationWorkflowInstanceLogInfoRequest self = new GetMigrationWorkflowInstanceLogInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMigrationWorkflowInstanceLogInfoRequest setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

}
