// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowAutoRefreshResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelDataFlowAutoRefreshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelDataFlowAutoRefreshResponseBody self = new CancelDataFlowAutoRefreshResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelDataFlowAutoRefreshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
