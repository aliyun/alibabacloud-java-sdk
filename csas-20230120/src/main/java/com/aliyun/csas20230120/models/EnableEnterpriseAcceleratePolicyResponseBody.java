// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class EnableEnterpriseAcceleratePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>09D9F396-29C5-5F0F-9C12-83308062CA2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableEnterpriseAcceleratePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableEnterpriseAcceleratePolicyResponseBody self = new EnableEnterpriseAcceleratePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableEnterpriseAcceleratePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
