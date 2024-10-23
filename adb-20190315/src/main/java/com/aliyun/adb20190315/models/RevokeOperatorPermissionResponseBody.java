// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class RevokeOperatorPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeOperatorPermissionResponseBody self = new RevokeOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
