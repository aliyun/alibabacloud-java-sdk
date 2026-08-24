// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteVulScanScheduledStrategyRequest extends TeaModel {
    /**
     * <p>The ID of the scheduled vulnerability scanning policy to delete. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListVulScanScheduledStrategies~~">ListVulScanScheduledStrategies</a>: Lists scheduled vulnerability scanning policies.</li>
     * <li><a href="~~CreateVulScanScheduledStrategy~~">CreateVulScanScheduledStrategy</a>: Creates a scheduled vulnerability scanning policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static DeleteVulScanScheduledStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulScanScheduledStrategyRequest self = new DeleteVulScanScheduledStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVulScanScheduledStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
