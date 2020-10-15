// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AuthorizeSecurityGroupEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupEgressResponse self = new AuthorizeSecurityGroupEgressResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupEgressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
