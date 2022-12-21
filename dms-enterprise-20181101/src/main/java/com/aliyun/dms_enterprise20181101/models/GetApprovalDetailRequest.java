// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetApprovalDetailRequest extends TeaModel {
    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    // The ID of the approval process. You can call the [GetOrderBaseInfo](~~144642~~) operation to query the ID of the approval process.
    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    public static GetApprovalDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalDetailRequest self = new GetApprovalDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetApprovalDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetApprovalDetailRequest setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
