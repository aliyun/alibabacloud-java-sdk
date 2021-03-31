// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RevokeSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupResponse self = new RevokeSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
