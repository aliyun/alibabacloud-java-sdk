// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupResponseBody self = new RevokeSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
