// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegeResponseBody self = new ModifyAccountPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
