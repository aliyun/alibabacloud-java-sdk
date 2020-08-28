// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AuthorizeSecurityGroupEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupEgressResponse self = new AuthorizeSecurityGroupEgressResponse();
        return TeaModel.build(map, self);
    }

}
