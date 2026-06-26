// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleResponseBody self = new UpdateRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
