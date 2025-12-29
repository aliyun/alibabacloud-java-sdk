// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class AllocateDBInstanceSrvNetworkAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6B82A9EF-9961-5A31-A19F-009B7098ACCA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateDBInstanceSrvNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateDBInstanceSrvNetworkAddressResponseBody self = new AllocateDBInstanceSrvNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateDBInstanceSrvNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
