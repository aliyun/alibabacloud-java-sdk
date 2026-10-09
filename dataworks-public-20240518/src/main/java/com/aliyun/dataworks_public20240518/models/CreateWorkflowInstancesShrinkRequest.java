// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to run the instance immediately after it is created. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoStartEnabled")
    public Boolean autoStartEnabled;

    /**
     * <p>The reason for creation.</p>
     * 
     * <strong>example:</strong>
     * <p>create for test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The runtime configurations.</p>
     */
    @NameInMap("DefaultRunProperties")
    public String defaultRunPropertiesShrink;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: production.</li>
     * <li>Dev: development.</li>
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
     * <p>The data backfill period settings.</p>
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
     * <p>The tag creation policy.</p>
     * <ul>
     * <li>Append: Append mode. Inherits existing tags from the manual business process and appends new tags.</li>
     * <li>Overwrite: Overwrite mode. Does not inherit existing tags from the manual business process and directly creates tags.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Append</p>
     */
    @NameInMap("TagCreationPolicy")
    public String tagCreationPolicy;

    /**
     * <p>The list of task tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The task parameters. You can use this parameter to set parameters for specific tasks. The value is in JSON format. The key is the task ID. For the format of the value, refer to the task script parameters (Task.Script.Parameter in the response of the GetTask operation).</p>
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
     * <p>The type of the workflow instance. Valid values:</p>
     * <ul>
     * <li>SupplementData: data backfill. The methods for specifying RootTaskIds and IncludeTaskIds vary based on the data backfill pattern. For more information, see the parameter description of DefaultRunProperties.Mode.</li>
     * <li>ManualWorkflow: manual workflow. You must set WorkflowId to the ID of the manual workflow. RootTaskIds is optional. If you do not specify RootTaskIds, the default root node list of the manual workflow is used.</li>
     * <li>Manual: manual task. You only need to specify RootTaskIds, which is the list of manual tasks to be run.</li>
     * <li>SmokeTest: smoke test. You only need to specify RootTaskIds, which is the list of test tasks to be run.</li>
     * <li>TriggerWorkflow: trigger-based workflow. You must set WorkflowId to the ID of the trigger-based workflow. IncludeTaskIds is optional. If you do not specify IncludeTaskIds, the entire workflow is run.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SupplementData</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the workflow to which the task belongs. The WorkflowId of a periodic task is always 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
     * <p>The workflow parameters. This parameter takes effect only when a specific workflow is specified (WorkflowId != 1). For a periodic workflow or a trigger-based workflow, the format is key=value, and the priority is lower than that of task parameters. For a manual workflow, the format is JSON, and the priority is higher than that of task parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;key=value&quot; format:
     * key1=value1 key2=value2
     * JSON format:
     * {&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
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

    public CreateWorkflowInstancesShrinkRequest setTagCreationPolicy(String tagCreationPolicy) {
        this.tagCreationPolicy = tagCreationPolicy;
        return this;
    }
    public String getTagCreationPolicy() {
        return this.tagCreationPolicy;
    }

    public CreateWorkflowInstancesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
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
