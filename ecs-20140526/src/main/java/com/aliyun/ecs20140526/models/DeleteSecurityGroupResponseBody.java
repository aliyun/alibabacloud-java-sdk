// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupResponseBody self = new DeleteSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
