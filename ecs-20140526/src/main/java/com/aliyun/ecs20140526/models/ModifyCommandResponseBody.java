// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommandResponseBody self = new ModifyCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
