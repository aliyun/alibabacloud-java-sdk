// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-872b5e911b35****</p>
     */
    @NameInMap("ApprovalId")
    public String approvalId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateApprovalStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalStatusRequest self = new UpdateApprovalStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalStatusRequest setApprovalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public String getApprovalId() {
        return this.approvalId;
    }

    public UpdateApprovalStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
