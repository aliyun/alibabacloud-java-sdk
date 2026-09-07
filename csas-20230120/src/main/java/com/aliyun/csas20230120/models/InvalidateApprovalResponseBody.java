// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class InvalidateApprovalResponseBody extends TeaModel {
    /**
     * <p>The ID of the invalidated approval instance.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-6b5188a28634****</p>
     */
    @NameInMap("ApprovalId")
    public String approvalId;

    /**
     * <p>The effective status of the approval. When the invalidation succeeds, the value is fixed as Expired, which indicates that the approval has been invalidated.</p>
     * 
     * <strong>example:</strong>
     * <p>Expired</p>
     */
    @NameInMap("EffectStatus")
    public String effectStatus;

    /**
     * <p>The approval type. Valid values:</p>
     * <ul>
     * <li>ApprovalReport: approval.</li>
     * <li>BackendReport: backend approval.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BackendReport</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InvalidateApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvalidateApprovalResponseBody self = new InvalidateApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public InvalidateApprovalResponseBody setApprovalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public String getApprovalId() {
        return this.approvalId;
    }

    public InvalidateApprovalResponseBody setEffectStatus(String effectStatus) {
        this.effectStatus = effectStatus;
        return this;
    }
    public String getEffectStatus() {
        return this.effectStatus;
    }

    public InvalidateApprovalResponseBody setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public InvalidateApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
