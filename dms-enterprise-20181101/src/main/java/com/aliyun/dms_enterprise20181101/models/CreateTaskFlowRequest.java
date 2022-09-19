// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateTaskFlowRequest extends TeaModel {
    @NameInMap("DagName")
    public String dagName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ScenarioId")
    public Long scenarioId;

    @NameInMap("Tid")
    public Long tid;

    public static CreateTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskFlowRequest self = new CreateTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskFlowRequest setDagName(String dagName) {
        this.dagName = dagName;
        return this;
    }
    public String getDagName() {
        return this.dagName;
    }

    public CreateTaskFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTaskFlowRequest setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public CreateTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
