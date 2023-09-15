// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAttributeResponseBody extends TeaModel {
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
