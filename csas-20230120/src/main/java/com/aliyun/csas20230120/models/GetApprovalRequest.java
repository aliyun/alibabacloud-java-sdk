// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalRequest extends TeaModel {
    /**
     * <p>The approval instance ID. You can obtain the value from:</p>
     * <ul>
     * <li><a href="~~ListApprovals~~">ListApprovals</a>: Lists approval instances.</li>
     * <li><a href="~~GetApproval~~">GetApproval</a>: Queries the details of an approval instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-872b5e911b35****</p>
     */
    @NameInMap("ApprovalId")
    public String approvalId;

    public static GetApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalRequest self = new GetApprovalRequest();
        return TeaModel.build(map, self);
    }

    public GetApprovalRequest setApprovalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public String getApprovalId() {
        return this.approvalId;
    }

}
