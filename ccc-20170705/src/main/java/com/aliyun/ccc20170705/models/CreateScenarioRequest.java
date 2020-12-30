// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateScenarioRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("StrategyJson")
    public String strategyJson;

    @NameInMap("Type")
    public String type;

    @NameInMap("SurveysJson")
    public java.util.List<String> surveysJson;

    public static CreateScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScenarioRequest self = new CreateScenarioRequest();
        return TeaModel.build(map, self);
    }

    public CreateScenarioRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScenarioRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScenarioRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScenarioRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public CreateScenarioRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateScenarioRequest setSurveysJson(java.util.List<String> surveysJson) {
        this.surveysJson = surveysJson;
        return this;
    }
    public java.util.List<String> getSurveysJson() {
        return this.surveysJson;
    }

}
