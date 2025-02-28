// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class RevokeInstanceEgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeInstanceEgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceEgressResponseBody self = new RevokeInstanceEgressResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceEgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
