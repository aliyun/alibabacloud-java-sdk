// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemovePublicIpsFromEpnInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E	 Request ID.</p>
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
