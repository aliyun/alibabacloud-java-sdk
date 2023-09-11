// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossBorderApprovalStatusResponseBody extends TeaModel {
    /**
     * <p>Cross border permissions of Alibaba Cloud account (main account).</p>
     * <br>
     * <p>-  UNAPPLIED : No cross-border permission application has been submitted or application records cannot be found.</p>
     * <p>-  APPLIED : Cross-border permission review in progress.</p>
     * <p>-  REJECTED : Cross-border permission review failed.</p>
     * <p>-  PASSED : Cross-border permission review passed.</p>
     */
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    /**
     * <p>The ID of the request.</p>
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
