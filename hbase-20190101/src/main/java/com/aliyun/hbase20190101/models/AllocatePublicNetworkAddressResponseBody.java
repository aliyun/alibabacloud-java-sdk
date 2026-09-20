// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AllocatePublicNetworkAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50373857-C47B-4B64-9332-D0B5280B59EA</p>
     */
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
