// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateTaskFlowRequest extends TeaModel {
    /**
     * <p>The name of the task flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dag_Name</p>
     */
    @NameInMap("DagName")
    public String dagName;

    /**
     * <p>The description of the task flow.</p>
     * 
     * <strong>example:</strong>
     * <p>zht_test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>2**</p>
     */
    @NameInMap("ScenarioId")
    public Long scenarioId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
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
