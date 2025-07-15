// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ChangeLiveDomainResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>8F-F82F-10E2-BAE1-A036FD</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeLiveDomainResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeLiveDomainResourceGroupResponseBody self = new ChangeLiveDomainResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeLiveDomainResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
