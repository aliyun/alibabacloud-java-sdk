// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>65BDA532-28AF-4122-AA39-B382721EEE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceResourceGroupResponseBody self = new ModifyDBInstanceResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
