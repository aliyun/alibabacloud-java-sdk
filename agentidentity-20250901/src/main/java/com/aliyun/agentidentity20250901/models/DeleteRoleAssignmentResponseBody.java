// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteRoleAssignmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRoleAssignmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleAssignmentResponseBody self = new DeleteRoleAssignmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoleAssignmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
