// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteAutoProvisioningGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAutoProvisioningGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoProvisioningGroupResponseBody self = new DeleteAutoProvisioningGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAutoProvisioningGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
