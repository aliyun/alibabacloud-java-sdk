// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskAsyncShrinkRequest extends TeaModel {
    /**
     * <p>The client unique code of the node, used to uniquely identify a node. This code is used for asynchronous processing and idempotence. If you do not specify this parameter when creating a node, the system automatically generates a value and binds it to the resource ID. If you specify this parameter when updating or deleting a resource, the value must match the client unique code used when the resource was created.</p>
     * 
     * <strong>example:</strong>
     * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
     */
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    /**
     * <p>The associated data source information.</p>
     */
    @NameInMap("DataSource")
    public String dataSourceShrink;

    /**
     * <p>The dependency information.</p>
     */
    @NameInMap("Dependencies")
    public String dependenciesShrink;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: production</li>
     * <li>Dev: development</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The input information.</p>
     */
    @NameInMap("Inputs")
    public String inputsShrink;

    /**
     * <p>The instance generation mode. Valid values:</p>
     * <ul>
     * <li>T+1: generates instances the next day.</li>
     * <li>Immediately: generates instances immediately. Note: only periodic instances whose scheduled time is more than 10 minutes after the node publish time are generated normally. During the full-to-instance conversion period (22:00–24:00), real-time instance conversion is not supported. You can submit and publish nodes, but new nodes are not automatically converted to instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T+1</p>
     */
    @NameInMap("InstanceMode")
    public String instanceMode;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output information.</p>
     */
    @NameInMap("Outputs")
    public String outputsShrink;

    /**
     * <p>The account ID of the node owner. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and hover over the profile picture in the upper-right corner of the top navigation bar to view the account ID. If this parameter is left empty, the Alibaba Cloud account ID of the caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The retry time interval, in milliseconds. The value cannot exceed 1800000.</p>
     * 
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("RerunInterval")
    public Integer rerunInterval;

    /**
     * <p>The configuration that specifies whether the node can be rerun. Valid values:</p>
     * <ul>
     * <li>AllDenied: the node cannot be rerun regardless of whether it succeeds or fails.</li>
     * <li>FailureAllowed: the node can be rerun only if it fails.</li>
     * <li>AllAllowed: the node can be rerun regardless of whether it succeeds or fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AllAllowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The number of retries. This parameter takes effect only when the node is configured to allow reruns.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RerunTimes")
    public Integer rerunTimes;

    /**
     * <p>The runtime environment configuration, such as the resource group information.</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    /**
     * <p>The runtime script information.</p>
     */
    @NameInMap("Script")
    public String scriptShrink;

    /**
     * <p>The list of data asset tags to attach.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The timeout period defined in the scheduling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The trigger method of the node.</p>
     */
    @NameInMap("Trigger")
    public String triggerShrink;

    public static UpdateTaskAsyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAsyncShrinkRequest self = new UpdateTaskAsyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAsyncShrinkRequest setClientUniqueCode(String clientUniqueCode) {
        this.clientUniqueCode = clientUniqueCode;
        return this;
    }
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    public UpdateTaskAsyncShrinkRequest setDataSourceShrink(String dataSourceShrink) {
        this.dataSourceShrink = dataSourceShrink;
        return this;
    }
    public String getDataSourceShrink() {
        return this.dataSourceShrink;
    }

    public UpdateTaskAsyncShrinkRequest setDependenciesShrink(String dependenciesShrink) {
        this.dependenciesShrink = dependenciesShrink;
        return this;
    }
    public String getDependenciesShrink() {
        return this.dependenciesShrink;
    }

    public UpdateTaskAsyncShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskAsyncShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateTaskAsyncShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTaskAsyncShrinkRequest setInputsShrink(String inputsShrink) {
        this.inputsShrink = inputsShrink;
        return this;
    }
    public String getInputsShrink() {
        return this.inputsShrink;
    }

    public UpdateTaskAsyncShrinkRequest setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }
    public String getInstanceMode() {
        return this.instanceMode;
    }

    public UpdateTaskAsyncShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTaskAsyncShrinkRequest setOutputsShrink(String outputsShrink) {
        this.outputsShrink = outputsShrink;
        return this;
    }
    public String getOutputsShrink() {
        return this.outputsShrink;
    }

    public UpdateTaskAsyncShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateTaskAsyncShrinkRequest setRerunInterval(Integer rerunInterval) {
        this.rerunInterval = rerunInterval;
        return this;
    }
    public Integer getRerunInterval() {
        return this.rerunInterval;
    }

    public UpdateTaskAsyncShrinkRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public UpdateTaskAsyncShrinkRequest setRerunTimes(Integer rerunTimes) {
        this.rerunTimes = rerunTimes;
        return this;
    }
    public Integer getRerunTimes() {
        return this.rerunTimes;
    }

    public UpdateTaskAsyncShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

    public UpdateTaskAsyncShrinkRequest setScriptShrink(String scriptShrink) {
        this.scriptShrink = scriptShrink;
        return this;
    }
    public String getScriptShrink() {
        return this.scriptShrink;
    }

    public UpdateTaskAsyncShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateTaskAsyncShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateTaskAsyncShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
