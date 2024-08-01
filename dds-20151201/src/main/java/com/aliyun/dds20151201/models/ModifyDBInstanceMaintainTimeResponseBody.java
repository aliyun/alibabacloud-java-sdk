// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMaintainTimeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A9310426-C763-42A2-A3AD-70A8DA204531</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceMaintainTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMaintainTimeResponseBody self = new ModifyDBInstanceMaintainTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMaintainTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
