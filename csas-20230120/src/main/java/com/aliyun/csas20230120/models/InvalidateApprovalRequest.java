// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class InvalidateApprovalRequest extends TeaModel {
    /**
     * <p>The ID of the approval instance to immediately invalidate. You can call ListApprovals to query approval instance IDs. Only one approval instance ID under the current Alibaba Cloud account can be specified per request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-6b5188a28634****</p>
     */
    @NameInMap("ApprovalId")
    public String approvalId;

    public static InvalidateApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        InvalidateApprovalRequest self = new InvalidateApprovalRequest();
        return TeaModel.build(map, self);
    }

    public InvalidateApprovalRequest setApprovalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public String getApprovalId() {
        return this.approvalId;
    }

}
