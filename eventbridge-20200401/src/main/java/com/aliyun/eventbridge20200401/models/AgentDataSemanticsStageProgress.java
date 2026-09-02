// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AgentDataSemanticsStageProgress extends TeaModel {
    /**
     * <p>The stage name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROFILE</p>
     */
    @NameInMap("Stage")
    public String stage;

    /**
     * <p>The stage status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("Status")
    public String status;

    public static AgentDataSemanticsStageProgress build(java.util.Map<String, ?> map) throws Exception {
        AgentDataSemanticsStageProgress self = new AgentDataSemanticsStageProgress();
        return TeaModel.build(map, self);
    }

    public AgentDataSemanticsStageProgress setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public AgentDataSemanticsStageProgress setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
