// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageShareGroupPermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImageShareGroupPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareGroupPermissionResponseBody self = new ModifyImageShareGroupPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImageShareGroupPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
