// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceEgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeInstanceEgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeInstanceEgressResponseBody self = new AuthorizeInstanceEgressResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeInstanceEgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
