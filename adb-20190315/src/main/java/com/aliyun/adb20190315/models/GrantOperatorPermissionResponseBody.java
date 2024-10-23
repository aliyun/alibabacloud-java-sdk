// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class GrantOperatorPermissionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A438072A-E2E7-5509-9A3F-66293512A820</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantOperatorPermissionResponseBody self = new GrantOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
