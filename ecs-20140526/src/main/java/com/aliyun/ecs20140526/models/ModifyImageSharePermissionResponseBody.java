// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImageSharePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionResponseBody self = new ModifyImageSharePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
