// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVirusScanScheduledStrategyRequest extends TeaModel {
    /**
     * <p>The ID of the scheduled virus scan policy. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListVirusScanScheduledStrategies~~">ListVirusScanScheduledStrategies</a>: Lists scheduled virus scan policies.</li>
     * <li><a href="~~CreateVirusScanScheduledStrategy~~">CreateVirusScanScheduledStrategy</a>: Creates a scheduled virus scan policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vc-strategy-8a3f6c2e91b7****</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static GetVirusScanScheduledStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanScheduledStrategyRequest self = new GetVirusScanScheduledStrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetVirusScanScheduledStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
