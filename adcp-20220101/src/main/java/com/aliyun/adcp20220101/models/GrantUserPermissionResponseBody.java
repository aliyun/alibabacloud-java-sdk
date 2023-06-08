// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GrantUserPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionResponseBody self = new GrantUserPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
