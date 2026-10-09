// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RerunWorkflowInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The data timestamp specified for the manual workflow instance run, used for matching.</p>
     * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("Bizdate")
    public Long bizdate;

    /**
     * <p>The end trigger time (creation time) of the manual workflow instance used for matching. This parameter must be used together with StartTriggerTime.</p>
     * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("EndTriggerTime")
    public Long endTriggerTime;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: Production.</li>
     * <li>Dev: Development.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The matching conditions for the internal instances of the manual workflow instance.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>The list of manual workflow instance IDs used for matching.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>The name of the manual workflow used for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The start trigger time (creation time) of the manual workflow instance used for matching. This parameter must be used together with EndTriggerTime.</p>
     * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("StartTriggerTime")
    public Long startTriggerTime;

    /**
     * <p>The running status of the manual workflow instance used for matching.</p>
     * 
     * <strong>example:</strong>
     * <p>Failure</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the workflow instance. Valid values:</p>
     * <ul>
     * <li>ManualWorkflow: Manual workflow.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ManualWorkflow</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static RerunWorkflowInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunWorkflowInstancesShrinkRequest self = new RerunWorkflowInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RerunWorkflowInstancesShrinkRequest setBizdate(Long bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public Long getBizdate() {
        return this.bizdate;
    }

    public RerunWorkflowInstancesShrinkRequest setEndTriggerTime(Long endTriggerTime) {
        this.endTriggerTime = endTriggerTime;
        return this;
    }
    public Long getEndTriggerTime() {
        return this.endTriggerTime;
    }

    public RerunWorkflowInstancesShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public RerunWorkflowInstancesShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public RerunWorkflowInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public RerunWorkflowInstancesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RerunWorkflowInstancesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RerunWorkflowInstancesShrinkRequest setStartTriggerTime(Long startTriggerTime) {
        this.startTriggerTime = startTriggerTime;
        return this;
    }
    public Long getStartTriggerTime() {
        return this.startTriggerTime;
    }

    public RerunWorkflowInstancesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RerunWorkflowInstancesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RerunWorkflowInstancesShrinkRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
