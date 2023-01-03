// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteScenarioRequest extends TeaModel {
    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the business monitoring job. You can obtain the ID by calling the ListScenario operation.
    @NameInMap("ScenarioId")
    public Long scenarioId;

    public static DeleteScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenarioRequest self = new DeleteScenarioRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScenarioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteScenarioRequest setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Long getScenarioId() {
        return this.scenarioId;
    }

}
