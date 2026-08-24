// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteVulScanScheduledStrategyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVulScanScheduledStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulScanScheduledStrategyResponseBody self = new DeleteVulScanScheduledStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVulScanScheduledStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
