// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class WithdrawPublishedRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
