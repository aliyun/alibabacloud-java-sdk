// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RollbackInstanceRefreshResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B13527BF-1FBD-4334-A512-20F5E9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackInstanceRefreshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceRefreshResponseBody self = new RollbackInstanceRefreshResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceRefreshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
