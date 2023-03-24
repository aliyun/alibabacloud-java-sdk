// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountPrivilegesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegesResponseBody self = new ModifyAccountPrivilegesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
