// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceConnectionModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionModeResponseBody self = new ModifyDBInstanceConnectionModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
