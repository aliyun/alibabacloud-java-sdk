// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateScenarioRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ScenarioName")
    public String scenarioName;

    @NameInMap("Tid")
    public Long tid;

    public static CreateScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScenarioRequest self = new CreateScenarioRequest();
        return TeaModel.build(map, self);
    }

    public CreateScenarioRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScenarioRequest setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }
    public String getScenarioName() {
        return this.scenarioName;
    }

    public CreateScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
