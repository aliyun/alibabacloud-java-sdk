// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class OpenGovernanceServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FEF9F-6442-16F6-B041-9013B97987AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenGovernanceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenGovernanceServiceResponseBody self = new OpenGovernanceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenGovernanceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
