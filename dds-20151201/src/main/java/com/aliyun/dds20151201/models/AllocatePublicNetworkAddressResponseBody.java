// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class AllocatePublicNetworkAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8AA45036-497F-52E7-B951-F9C7B239****</p>
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
