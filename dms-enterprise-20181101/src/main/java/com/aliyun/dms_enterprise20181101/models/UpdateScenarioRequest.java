// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateScenarioRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("ScenarioName")
    public String scenarioName;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScenarioRequest self = new UpdateScenarioRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScenarioRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateScenarioRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public UpdateScenarioRequest setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }
    public String getScenarioName() {
        return this.scenarioName;
    }

    public UpdateScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
