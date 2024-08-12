// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ReleaseClusterPublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseClusterPublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterPublicConnectionResponseBody self = new ReleaseClusterPublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterPublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
