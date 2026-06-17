// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>API-48109b5c-a157-44e3-9f54-eb27f02bdd15</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySQLCollectorPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorPolicyResponseBody self = new ModifySQLCollectorPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
