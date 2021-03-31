// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AuthorizeSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupResponse self = new AuthorizeSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
