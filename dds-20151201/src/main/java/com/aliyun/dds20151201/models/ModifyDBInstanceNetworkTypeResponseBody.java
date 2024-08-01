// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0E605FD-6ECE-5FBE-84A4-99AAB1B8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceNetworkTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeResponseBody self = new ModifyDBInstanceNetworkTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
