// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class AllocatePublicNetworkAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AllocatePublicNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicNetworkAddressResponseBody self = new AllocatePublicNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePublicNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
