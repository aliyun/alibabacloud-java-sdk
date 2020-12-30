// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobTemplateDownloadParamsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    public static GetJobTemplateDownloadParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobTemplateDownloadParamsRequest self = new GetJobTemplateDownloadParamsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobTemplateDownloadParamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetJobTemplateDownloadParamsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

}
