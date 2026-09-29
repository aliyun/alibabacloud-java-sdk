// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class DecommissionGovernanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>37C4280D-C0AC-5EDD-B1EF-013808C4A357</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DecommissionGovernanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecommissionGovernanceResponseBody self = new DecommissionGovernanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DecommissionGovernanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
