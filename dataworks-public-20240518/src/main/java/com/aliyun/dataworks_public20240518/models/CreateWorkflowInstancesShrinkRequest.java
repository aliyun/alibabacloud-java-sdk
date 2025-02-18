// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The default value is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoStartEnabled")
    public Boolean autoStartEnabled;

    /**
     * <p>The reason for the creation.</p>
     * 
     * <strong>example:</strong>
     * <p>create for test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Runtime configuration.</p>
     */
    @NameInMap("DefaultRunProperties")
    public String defaultRunPropertiesShrink;

    /**
     * <p>The project environment.</p>
     * <ul>
     * <li>Prod (production)</li>
     * <li>Dev</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowInstance1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Make up the data cycle settings.</p>
     */
    @NameInMap("Periods")
    public String periodsShrink;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Task parameters. Set parameters for a specific task. In JSON format, the key is the Task ID. For more information about the value format, see Task Script parameters (Task.Script. GetTask of the Parameter interface).</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;1001&quot;: &quot;key1=val2 key2=val2&quot;, 
     *   &quot;1002&quot;: &quot;key1=val2 key2=val2&quot;
     * }</p>
     */
    @NameInMap("TaskParameters")
    public String taskParameters;

    /**
     * <p>The type of the workflow instance.</p>
     * <ul>
     * <li>SupplementData: Retroactive data</li>
     * <li>ManualWorkflow: manual workflow</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SupplementData</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the workflow to which the workflow belongs. The default value of WorkflowId for retroactive data is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
     * <p>Workflow parameters. The priority is higher than the task parameters. JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{ 
     *   &quot;key1&quot;: &quot;value1&quot;, 
     *   &quot;key2&quot;: &quot;value2&quot; 
     * }</p>
     */
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
