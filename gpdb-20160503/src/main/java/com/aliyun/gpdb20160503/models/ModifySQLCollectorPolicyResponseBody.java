// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4FA1F1D1-50A6-4F60-9A78-5752F2076A53</p>
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
