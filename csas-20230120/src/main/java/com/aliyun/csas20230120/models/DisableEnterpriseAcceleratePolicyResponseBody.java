// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DisableEnterpriseAcceleratePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E4C3E4CA-87CC-5EF6-91DD-D400A812EB43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableEnterpriseAcceleratePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableEnterpriseAcceleratePolicyResponseBody self = new DisableEnterpriseAcceleratePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableEnterpriseAcceleratePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
