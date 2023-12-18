// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupResponseBody self = new AuthorizeSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
