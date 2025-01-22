// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Task_0bc5213917368545132902xxxxxxxx</p>
     */
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    @NameInMap("DataSource")
    public String dataSourceShrink;

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

    @NameInMap("Inputs")
    public String inputsShrink;

    /**
     * <strong>example:</strong>
     * <p>T+1</p>
     */
    @NameInMap("InstanceMode")
    public String instanceMode;

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
     * <p>60</p>
     */
    @NameInMap("RerunInterval")
    public Integer rerunInterval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AllAllowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RerunTimes")
    public Integer rerunTimes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    @NameInMap("Script")
    public String scriptShrink;

    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Trigger")
    public String triggerShrink;

    public static UpdateTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskShrinkRequest self = new UpdateTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskShrinkRequest setClientUniqueCode(String clientUniqueCode) {
        this.clientUniqueCode = clientUniqueCode;
        return this;
    }
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    public UpdateTaskShrinkRequest setDataSourceShrink(String dataSourceShrink) {
        this.dataSourceShrink = dataSourceShrink;
        return this;
    }
    public String getDataSourceShrink() {
        return this.dataSourceShrink;
    }

    public UpdateTaskShrinkRequest setDependenciesShrink(String dependenciesShrink) {
        this.dependenciesShrink = dependenciesShrink;
        return this;
    }
    public String getDependenciesShrink() {
        return this.dependenciesShrink;
    }

    public UpdateTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateTaskShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTaskShrinkRequest setInputsShrink(String inputsShrink) {
        this.inputsShrink = inputsShrink;
        return this;
    }
    public String getInputsShrink() {
        return this.inputsShrink;
    }

    public UpdateTaskShrinkRequest setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }
    public String getInstanceMode() {
        return this.instanceMode;
    }

    public UpdateTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTaskShrinkRequest setOutputsShrink(String outputsShrink) {
        this.outputsShrink = outputsShrink;
        return this;
    }
    public String getOutputsShrink() {
        return this.outputsShrink;
    }

    public UpdateTaskShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateTaskShrinkRequest setRerunInterval(Integer rerunInterval) {
        this.rerunInterval = rerunInterval;
        return this;
    }
    public Integer getRerunInterval() {
        return this.rerunInterval;
    }

    public UpdateTaskShrinkRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public UpdateTaskShrinkRequest setRerunTimes(Integer rerunTimes) {
        this.rerunTimes = rerunTimes;
        return this;
    }
    public Integer getRerunTimes() {
        return this.rerunTimes;
    }

    public UpdateTaskShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

    public UpdateTaskShrinkRequest setScriptShrink(String scriptShrink) {
        this.scriptShrink = scriptShrink;
        return this;
    }
    public String getScriptShrink() {
        return this.scriptShrink;
    }

    public UpdateTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateTaskShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateTaskShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
