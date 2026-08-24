// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVulScanScheduledStrategyRequest extends TeaModel {
    /**
     * <p>The vulnerability scheduled scan policy ID. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListVulScanScheduledStrategies~~">ListVulScanScheduledStrategies</a>: Lists vulnerability scheduled scan policies.</li>
     * <li><a href="~~CreateVulScanScheduledStrategy~~">CreateVulScanScheduledStrategy</a>: Creates a vulnerability scheduled scan policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static GetVulScanScheduledStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVulScanScheduledStrategyRequest self = new GetVulScanScheduledStrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetVulScanScheduledStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
