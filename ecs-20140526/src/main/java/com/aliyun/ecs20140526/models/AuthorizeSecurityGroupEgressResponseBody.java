// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeSecurityGroupEgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupEgressResponseBody self = new AuthorizeSecurityGroupEgressResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupEgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
