// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetScenarioRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    public static GetScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioRequest self = new GetScenarioRequest();
        return TeaModel.build(map, self);
    }

    public GetScenarioRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetScenarioRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

}
