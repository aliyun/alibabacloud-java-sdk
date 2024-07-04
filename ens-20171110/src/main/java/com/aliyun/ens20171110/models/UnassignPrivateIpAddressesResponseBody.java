// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassignPrivateIpAddressesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1ECC937A-AE0E-4626-BE51-DED1D6D1C888</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassignPrivateIpAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassignPrivateIpAddressesResponseBody self = new UnassignPrivateIpAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassignPrivateIpAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
