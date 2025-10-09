// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityScanShrinkRequest extends TeaModel {
    /**
     * <p>The compute engine used during execution. If it\&quot;s not specified, the data source connection defined in the Spec will be used.</p>
     */
    @NameInMap("ComputeResource")
    public String computeResourceShrink;

    /**
     * <p>Description of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily data quality scanning of ods tables.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The hook configuration after the data quality monitor stops.</p>
     */
    @NameInMap("Hooks")
    public String hooksShrink;

    /**
     * <p>The ID of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The user ID of the owner of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>231263586109857423</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The definition of execution parameters for the data quality monitor.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The ID of the DataWorks workspace where the data quality monitor resides. You can obtain the workspace ID by calling the <a href="https://help.aliyun.com/document_detail/2852607.html">ListProjects</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group used during the execution of the data quality monitor.</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    /**
     * <p>The Spec code of the data quality monitoring content. For more information, see <a href="https://help.aliyun.com/document_detail/2963394.html">Data quality Spec configuration description</a>.</p>
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
     * <p>Trigger settings for the data quality monitor.</p>
     */
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
