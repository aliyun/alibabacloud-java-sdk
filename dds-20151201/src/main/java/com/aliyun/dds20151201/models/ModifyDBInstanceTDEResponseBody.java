// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDEResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceTDEResponseBody self = new ModifyDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
