// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteVirusScanScheduledStrategiesRequest extends TeaModel {
    /**
     * <p>The IDs of the virus scheduled scan policies to delete. The collection must contain at least 1 and at most 100 IDs. Duplicate IDs are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyIds")
    public java.util.List<String> strategyIds;

    public static DeleteVirusScanScheduledStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirusScanScheduledStrategiesRequest self = new DeleteVirusScanScheduledStrategiesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirusScanScheduledStrategiesRequest setStrategyIds(java.util.List<String> strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public java.util.List<String> getStrategyIds() {
        return this.strategyIds;
    }

}
