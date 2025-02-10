// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E466EFD6-2AD2-xxxx-A1A6-C7AFA1B323E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConfigResponseBody self = new ModifyDBInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
