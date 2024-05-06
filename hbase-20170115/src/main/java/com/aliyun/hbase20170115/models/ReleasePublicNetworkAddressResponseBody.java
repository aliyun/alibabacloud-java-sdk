// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ReleasePublicNetworkAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleasePublicNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicNetworkAddressResponseBody self = new ReleasePublicNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePublicNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
