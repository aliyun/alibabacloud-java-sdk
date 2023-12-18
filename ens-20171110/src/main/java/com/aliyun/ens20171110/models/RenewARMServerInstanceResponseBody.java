// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RenewARMServerInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewARMServerInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewARMServerInstanceResponseBody self = new RenewARMServerInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewARMServerInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
