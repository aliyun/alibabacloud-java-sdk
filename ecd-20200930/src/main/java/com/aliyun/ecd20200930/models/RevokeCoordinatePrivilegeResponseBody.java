// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RevokeCoordinatePrivilegeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeCoordinatePrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeCoordinatePrivilegeResponseBody self = new RevokeCoordinatePrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeCoordinatePrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
