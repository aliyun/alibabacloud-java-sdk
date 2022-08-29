// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalInfoRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    public static GetCsccApprovalInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalInfoRequest self = new GetCsccApprovalInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalInfoRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

}
