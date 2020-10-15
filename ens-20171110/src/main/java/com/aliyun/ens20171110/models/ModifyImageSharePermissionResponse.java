// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyImageSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionResponse self = new ModifyImageSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
