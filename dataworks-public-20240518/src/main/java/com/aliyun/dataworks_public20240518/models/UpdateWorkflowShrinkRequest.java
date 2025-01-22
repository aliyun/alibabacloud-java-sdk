// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateWorkflowShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
     */
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    @NameInMap("Dependencies")
    public String dependenciesShrink;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Outputs")
    public String outputsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>para1=$bizdate para2=$[yyyymmdd]</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("Tasks")
    public String tasksShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Trigger")
    public String triggerShrink;

    public static UpdateWorkflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowShrinkRequest self = new UpdateWorkflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowShrinkRequest setClientUniqueCode(String clientUniqueCode) {
        this.clientUniqueCode = clientUniqueCode;
        return this;
    }
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    public UpdateWorkflowShrinkRequest setDependenciesShrink(String dependenciesShrink) {
        this.dependenciesShrink = dependenciesShrink;
        return this;
    }
    public String getDependenciesShrink() {
        return this.dependenciesShrink;
    }

    public UpdateWorkflowShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkflowShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateWorkflowShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateWorkflowShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkflowShrinkRequest setOutputsShrink(String outputsShrink) {
        this.outputsShrink = outputsShrink;
        return this;
    }
    public String getOutputsShrink() {
        return this.outputsShrink;
    }

    public UpdateWorkflowShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateWorkflowShrinkRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public UpdateWorkflowShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateWorkflowShrinkRequest setTasksShrink(String tasksShrink) {
        this.tasksShrink = tasksShrink;
        return this;
    }
    public String getTasksShrink() {
        return this.tasksShrink;
    }

    public UpdateWorkflowShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
