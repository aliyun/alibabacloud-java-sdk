// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserProvisioningEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserProvisioningEventResponseBody self = new DeleteUserProvisioningEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserProvisioningEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
