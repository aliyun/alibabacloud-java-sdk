// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeColumnPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the permissions on table fields are revoked.</p>
     */
    @NameInMap("RevokeSuccess")
    public Boolean revokeSuccess;

    public static RevokeColumnPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeColumnPermissionResponseBody self = new RevokeColumnPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeColumnPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeColumnPermissionResponseBody setRevokeSuccess(Boolean revokeSuccess) {
        this.revokeSuccess = revokeSuccess;
        return this;
    }
    public Boolean getRevokeSuccess() {
        return this.revokeSuccess;
    }

}
