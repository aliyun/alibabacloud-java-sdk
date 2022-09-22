// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyPrivatePoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPrivatePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivatePoolResponseBody self = new ModifyPrivatePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrivatePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
