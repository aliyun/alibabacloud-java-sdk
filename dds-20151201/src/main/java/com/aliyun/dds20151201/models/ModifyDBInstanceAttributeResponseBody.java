// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6826DEE3-B374-5DB7-909D-C8978827C534</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAttributeResponseBody self = new ModifyDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
