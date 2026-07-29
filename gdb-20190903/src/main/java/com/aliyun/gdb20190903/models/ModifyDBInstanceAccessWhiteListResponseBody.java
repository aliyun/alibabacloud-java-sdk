// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAccessWhiteListResponseBody self = new ModifyDBInstanceAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
