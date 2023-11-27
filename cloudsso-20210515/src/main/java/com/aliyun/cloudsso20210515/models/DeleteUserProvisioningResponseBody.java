// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserProvisioningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserProvisioningResponseBody self = new DeleteUserProvisioningResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserProvisioningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
