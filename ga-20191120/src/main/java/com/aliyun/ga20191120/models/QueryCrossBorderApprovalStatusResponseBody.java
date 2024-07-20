// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossBorderApprovalStatusResponseBody extends TeaModel {
    /**
     * <p>Cross border permissions of Alibaba Cloud account (main account).</p>
     * <ul>
     * <li>UNAPPLIED : No cross-border permission application has been submitted or application records cannot be found.</li>
     * <li>APPLIED : Cross-border permission review in progress.</li>
     * <li>REJECTED : Cross-border permission review failed.</li>
     * <li>PASSED : Cross-border permission review passed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UNAPPLIED</p>
     */
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F96E634B-A523-587F-9A09-AE8B2FD04B9C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryCrossBorderApprovalStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCrossBorderApprovalStatusResponseBody self = new QueryCrossBorderApprovalStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCrossBorderApprovalStatusResponseBody setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public QueryCrossBorderApprovalStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
