// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CancelVulScanTasksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelVulScanTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelVulScanTasksResponseBody self = new CancelVulScanTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelVulScanTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
