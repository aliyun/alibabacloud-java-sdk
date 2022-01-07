// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetApprovalDetailRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

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
