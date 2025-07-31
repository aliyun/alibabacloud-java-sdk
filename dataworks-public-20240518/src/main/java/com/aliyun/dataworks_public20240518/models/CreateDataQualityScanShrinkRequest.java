// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a-customized-uuid</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ComputeResource")
    public String computeResourceShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Hooks")
    public String hooksShrink;

    /**
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Trigger")
    public String triggerShrink;

    public static CreateDataQualityScanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanShrinkRequest self = new CreateDataQualityScanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataQualityScanShrinkRequest setComputeResourceShrink(String computeResourceShrink) {
        this.computeResourceShrink = computeResourceShrink;
        return this;
    }
    public String getComputeResourceShrink() {
        return this.computeResourceShrink;
    }

    public CreateDataQualityScanShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataQualityScanShrinkRequest setHooksShrink(String hooksShrink) {
        this.hooksShrink = hooksShrink;
        return this;
    }
    public String getHooksShrink() {
        return this.hooksShrink;
    }

    public CreateDataQualityScanShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityScanShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDataQualityScanShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateDataQualityScanShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityScanShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

    public CreateDataQualityScanShrinkRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateDataQualityScanShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
