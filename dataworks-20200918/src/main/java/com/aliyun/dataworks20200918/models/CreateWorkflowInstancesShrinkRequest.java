// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesShrinkRequest extends TeaModel {
    @NameInMap("AutoStartEnabled")
    public Boolean autoStartEnabled;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("DefaultRunProperties")
    public String defaultRunPropertiesShrink;

    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Periods")
    public String periodsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskParameters")
    public String taskParameters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    @NameInMap("WorkflowParameters")
    public String workflowParameters;

    public static CreateWorkflowInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowInstancesShrinkRequest self = new CreateWorkflowInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowInstancesShrinkRequest setAutoStartEnabled(Boolean autoStartEnabled) {
        this.autoStartEnabled = autoStartEnabled;
        return this;
    }
    public Boolean getAutoStartEnabled() {
        return this.autoStartEnabled;
    }

    public CreateWorkflowInstancesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateWorkflowInstancesShrinkRequest setDefaultRunPropertiesShrink(String defaultRunPropertiesShrink) {
        this.defaultRunPropertiesShrink = defaultRunPropertiesShrink;
        return this;
    }
    public String getDefaultRunPropertiesShrink() {
        return this.defaultRunPropertiesShrink;
    }

    public CreateWorkflowInstancesShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateWorkflowInstancesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkflowInstancesShrinkRequest setPeriodsShrink(String periodsShrink) {
        this.periodsShrink = periodsShrink;
        return this;
    }
    public String getPeriodsShrink() {
        return this.periodsShrink;
    }

    public CreateWorkflowInstancesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateWorkflowInstancesShrinkRequest setTaskParameters(String taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }
    public String getTaskParameters() {
        return this.taskParameters;
    }

    public CreateWorkflowInstancesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateWorkflowInstancesShrinkRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public CreateWorkflowInstancesShrinkRequest setWorkflowParameters(String workflowParameters) {
        this.workflowParameters = workflowParameters;
        return this;
    }
    public String getWorkflowParameters() {
        return this.workflowParameters;
    }

}
