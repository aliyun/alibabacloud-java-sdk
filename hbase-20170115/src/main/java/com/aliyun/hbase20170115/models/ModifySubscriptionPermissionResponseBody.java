// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionPermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static ModifySubscriptionPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionPermissionResponseBody self = new ModifySubscriptionPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySubscriptionPermissionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
