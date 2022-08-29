// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalDetailRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    public static GetCsccApprovalDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalDetailRequest self = new GetCsccApprovalDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalDetailRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

}
