// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class WithdrawPublishedRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBDB18D8-E91E-4978-8D6C-6E2E3EE10133</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static WithdrawPublishedRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WithdrawPublishedRouteEntriesResponseBody self = new WithdrawPublishedRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public WithdrawPublishedRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
