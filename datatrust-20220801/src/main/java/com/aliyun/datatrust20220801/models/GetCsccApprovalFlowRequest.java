// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalFlowRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    public static GetCsccApprovalFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalFlowRequest self = new GetCsccApprovalFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalFlowRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

}
