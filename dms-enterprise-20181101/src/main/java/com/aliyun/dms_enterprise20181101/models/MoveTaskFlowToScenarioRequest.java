// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MoveTaskFlowToScenarioRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("ScenarioId")
    public Long scenarioId;

    @NameInMap("Tid")
    public Long tid;

    public static MoveTaskFlowToScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveTaskFlowToScenarioRequest self = new MoveTaskFlowToScenarioRequest();
        return TeaModel.build(map, self);
    }

    public MoveTaskFlowToScenarioRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public MoveTaskFlowToScenarioRequest setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public MoveTaskFlowToScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
