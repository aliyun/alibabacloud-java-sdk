// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecResponseBody self = new ModifyDBInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
