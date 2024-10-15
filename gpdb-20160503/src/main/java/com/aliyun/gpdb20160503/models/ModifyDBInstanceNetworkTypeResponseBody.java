// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2d0c35a9-f5da-44ba-852d-741e27b7eb0b</p>
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
