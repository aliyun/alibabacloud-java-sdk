// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DisableInsightResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4ABAEA6E-C740-5CE2-A003-643E5519****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableInsightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableInsightResponseBody self = new DisableInsightResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableInsightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
