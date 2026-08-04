// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalStatusRequest extends TeaModel {
    /**
     * <p>The ID of the approval instance. Obtain the value from:</p>
     * <ul>
     * <li><p><a href="~~ListApprovals~~">ListApprovals</a>: Query a list of approval instances in batches.</p>
     * </li>
     * <li><p><a href="~~GetApproval~~">GetApproval</a>: Query the details of an approval instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-872b5e911b35****</p>
     */
    @NameInMap("ApprovalId")
    public String approvalId;

    /**
     * <p>The status of the approval instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Approved</strong>: Approved.</p>
     * </li>
     * <li><p><strong>Rejected</strong>: Rejected.</p>
     * </li>
     * </ul>
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
