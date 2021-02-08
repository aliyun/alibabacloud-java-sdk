// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupResponse self = new DeleteSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
