// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAutoProvisioningGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoProvisioningGroupResponse self = new DeleteAutoProvisioningGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoProvisioningGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
