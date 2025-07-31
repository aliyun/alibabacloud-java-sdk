// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityScanShrinkRequest extends TeaModel {
    @NameInMap("ComputeResource")
    public String computeResourceShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Hooks")
    public String hooksShrink;

    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>231263586109857423</p>
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

    public static UpdateDataQualityScanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityScanShrinkRequest self = new UpdateDataQualityScanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityScanShrinkRequest setComputeResourceShrink(String computeResourceShrink) {
        this.computeResourceShrink = computeResourceShrink;
        return this;
    }
    public String getComputeResourceShrink() {
        return this.computeResourceShrink;
    }

    public UpdateDataQualityScanShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataQualityScanShrinkRequest setHooksShrink(String hooksShrink) {
        this.hooksShrink = hooksShrink;
        return this;
    }
    public String getHooksShrink() {
        return this.hooksShrink;
    }

    public UpdateDataQualityScanShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityScanShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityScanShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateDataQualityScanShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public UpdateDataQualityScanShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityScanShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

    public UpdateDataQualityScanShrinkRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public UpdateDataQualityScanShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
