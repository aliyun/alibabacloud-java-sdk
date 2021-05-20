// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RevokeSuccess")
    @Validation(required = true)
    public Boolean revokeSuccess;

    public static RevokeTablePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeTablePermissionResponse self = new RevokeTablePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeTablePermissionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeTablePermissionResponse setRevokeSuccess(Boolean revokeSuccess) {
        this.revokeSuccess = revokeSuccess;
        return this;
    }
    public Boolean getRevokeSuccess() {
        return this.revokeSuccess;
    }

}
