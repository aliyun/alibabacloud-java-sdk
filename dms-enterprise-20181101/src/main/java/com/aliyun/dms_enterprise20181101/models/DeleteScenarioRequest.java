// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteScenarioRequest extends TeaModel {
    /**
     * <p>Deletes a business scenario.</p>
     */
    @NameInMap("ScenarioId")
    public Long scenarioId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenarioRequest self = new DeleteScenarioRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScenarioRequest setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public DeleteScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
