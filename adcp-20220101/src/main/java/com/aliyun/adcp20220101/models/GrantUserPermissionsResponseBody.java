// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4412F213-DBCD-5D1B-A9A1-F6C26C6C19D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantUserPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionsResponseBody self = new GrantUserPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
