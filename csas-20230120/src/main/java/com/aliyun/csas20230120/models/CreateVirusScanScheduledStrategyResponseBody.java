// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVirusScanScheduledStrategyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created scheduled virus scan policy.</p>
     * 
     * <strong>example:</strong>
     * <p>vc-strategy-8a3f6c2e91b7****</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static CreateVirusScanScheduledStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanScheduledStrategyResponseBody self = new CreateVirusScanScheduledStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanScheduledStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirusScanScheduledStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
