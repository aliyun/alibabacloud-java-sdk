// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the permissions are revoked.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RevokeSuccess")
    public Boolean revokeSuccess;

    public static RevokeTablePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeTablePermissionResponseBody self = new RevokeTablePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeTablePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeTablePermissionResponseBody setRevokeSuccess(Boolean revokeSuccess) {
        this.revokeSuccess = revokeSuccess;
        return this;
    }
    public Boolean getRevokeSuccess() {
        return this.revokeSuccess;
    }

}
