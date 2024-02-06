// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemovePublicIpsFromEpnInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemovePublicIpsFromEpnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemovePublicIpsFromEpnInstanceResponseBody self = new RemovePublicIpsFromEpnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemovePublicIpsFromEpnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
