// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a-customized-uuid</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The compute engine used at runtime. If not specified, the data source defined in the Spec is used.</p>
     */
    @NameInMap("ComputeResource")
    public String computeResourceShrink;

    /**
     * <p>The description of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily data quality scanning of ods tables.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Hook configurations after the data quality monitoring run ends.</p>
     */
    @NameInMap("Hooks")
    public String hooksShrink;

    /**
     * <p>The data quality monitoring name.</p>
     * 
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the user who owns of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The definition of execution parameters for the data quality monitoring.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the workspace configuration page to obtain the workspace ID. This parameter is required to specify the target DataWorks workspace for this API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group used during execution of the data quality monitoring.</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    /**
     * <p>Spec code for the content of the data quality monitoring.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;datasets&quot;: [
     *         {
     *             &quot;type&quot;: &quot;Table&quot;,
     *             &quot;dataSource&quot;: {
     *                 &quot;name&quot;: &quot;odps_first&quot;,
     *                 &quot;envType&quot;: &quot;Prod&quot;
     *             },
     *             &quot;tables&quot;: [
     *                 &quot;ods_d_user_info&quot;
     *             ],
     *             &quot;filter&quot;: &quot;pt = $[yyyymmdd-1]&quot;
     *         }
     *     ],
     *     &quot;rules&quot;: [
     *         {
     *             &quot;assertion&quot;: &quot;row_count &gt; 0&quot;
     *         }, {
     *             &quot;templateId&quot;: &quot;SYSTEM:field:null_value:fixed&quot;,
     *             &quot;pass&quot;: &quot;when = 0&quot;,
     *             &quot;name&quot;: &quot;The id cannot be empty.&quot;,
     *             &quot;severity&quot;: &quot;High&quot;,
     *              &quot;identity&quot;: &quot;a-customized-data-quality-rule-uuid&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The trigger configurations of the data quality monitoring task.</p>
     */
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
