// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopEpnInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopEpnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopEpnInstanceResponseBody self = new StopEpnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopEpnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
