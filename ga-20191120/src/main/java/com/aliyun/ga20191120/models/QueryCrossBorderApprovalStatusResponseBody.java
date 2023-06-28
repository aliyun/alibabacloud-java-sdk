// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossBorderApprovalStatusResponseBody extends TeaModel {
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

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
