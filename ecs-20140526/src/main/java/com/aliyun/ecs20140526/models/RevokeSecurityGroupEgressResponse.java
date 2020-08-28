// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RevokeSecurityGroupEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupEgressResponse self = new RevokeSecurityGroupEgressResponse();
        return TeaModel.build(map, self);
    }

}
