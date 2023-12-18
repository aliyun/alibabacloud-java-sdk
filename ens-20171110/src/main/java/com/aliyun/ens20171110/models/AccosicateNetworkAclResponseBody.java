// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AccosicateNetworkAclResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AccosicateNetworkAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccosicateNetworkAclResponseBody self = new AccosicateNetworkAclResponseBody();
        return TeaModel.build(map, self);
    }

    public AccosicateNetworkAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
