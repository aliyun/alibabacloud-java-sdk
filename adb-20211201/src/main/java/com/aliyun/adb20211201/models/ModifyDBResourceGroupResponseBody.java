// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourceGroupResponseBody self = new ModifyDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
