// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteScaleStrategyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    public static DeleteScaleStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScaleStrategyRequest self = new DeleteScaleStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScaleStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteScaleStrategyRequest setScaleStrategyId(String scaleStrategyId) {
        this.scaleStrategyId = scaleStrategyId;
        return this;
    }
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

}
