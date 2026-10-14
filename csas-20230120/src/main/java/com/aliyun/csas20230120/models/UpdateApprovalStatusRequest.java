// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalStatusRequest extends TeaModel {
    /**
     * <p>The ID of the approval instance. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListApprovals~~">ListApprovals</a>: Queries a list of approval instances.</li>
     * <li><a href="~~GetApproval~~">GetApproval</a>: Queries the details of an approval instance.</li>
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
     * <li><strong>Approved</strong>: Approved.</li>
     * <li><strong>Rejected</strong>: deny.</li>
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
