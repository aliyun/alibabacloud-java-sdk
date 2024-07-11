// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MoveTaskFlowToScenarioRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11****</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the business scenario to which you want to migrate your task flow. If this parameter is set to the default value or a value that is less than or equal to 0, the task flow is migrated to the default business scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("ScenarioId")
    public Long scenarioId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
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
