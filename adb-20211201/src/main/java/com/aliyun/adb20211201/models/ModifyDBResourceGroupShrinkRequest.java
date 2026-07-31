// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBResourceGroupShrinkRequest extends TeaModel {
    @NameInMap("AtmConfig")
    public String atmConfigShrink;

    /**
     * <p>The idle duration after which the resource group is automatically stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("AutoStopInterval")
    public String autoStopInterval;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ClusterSizeResource")
    public String clusterSizeResource;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Data Lakehouse Edition, Enterprise Edition, or Basic Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the spot instance feature for the resource group. This feature provides resources at a lower unit price, but they can be reclaimed at any time. Only <code>Job</code> resource groups support this feature. Valid values:</p>
     * <ul>
     * <li><p><strong>True</strong>: enables the spot instance feature.</p>
     * </li>
     * <li><p><strong>False</strong>: disables the spot instance feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableSpot")
    public Boolean enableSpot;

    /**
     * <p>The engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;spark.adb.version\&quot;:\&quot;3.5\&quot;}</p>
     */
    @NameInMap("EngineParams")
    public String engineParamsShrink;

    /**
     * <p>The time-based scaling plan for GPUs.</p>
     */
    @NameInMap("GpuElasticPlan")
    public String gpuElasticPlanShrink;

    /**
     * <p>The name of the resource group.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the resource group name for a specific cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li><p><strong>Interactive</strong></p>
     * </li>
     * <li><p><strong>Job</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about resource groups in Data Lakehouse Edition clusters, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Interactive</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("MaxClusterCount")
    public Integer maxClusterCount;

    /**
     * <p>The maximum amount of reserved computing resources. The value cannot exceed the unallocated computing resources of the cluster.</p>
     * <ul>
     * <li><p>If the resource group type is <code>Interactive</code>, the value is specified in increments of 16 ACU.</p>
     * </li>
     * <li><p>If the resource group type is <code>Job</code>, the value is specified in increments of 8 ACU.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>48ACU</p>
     */
    @NameInMap("MaxComputeResource")
    public String maxComputeResource;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("MaxGpuQuantity")
    public Integer maxGpuQuantity;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("MinClusterCount")
    public Integer minClusterCount;

    /**
     * <p>The minimum amount of reserved computing resources.</p>
     * <ul>
     * <li><p>If the resource group type is <code>Interactive</code>, the minimum amount of reserved computing resources is 16 ACU.</p>
     * </li>
     * <li><p>If the resource group type is <code>Job</code>, the minimum amount of reserved computing resources is 0 ACU.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0ACU</p>
     */
    @NameInMap("MinComputeResource")
    public String minComputeResource;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("MinGpuQuantity")
    public Integer minGpuQuantity;

    /**
     * <p>The Ray configuration. This parameter is required if the resource group is an AI group and uses a Ray cluster as its engine.</p>
     */
    @NameInMap("RayConfig")
    public String rayConfigShrink;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The job submission rules.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("SpecName")
    public String specName;

    /**
     * <p>The desired state of the resource group. Specify <strong>starting</strong> to start the resource group or <strong>stopping</strong> to stop it.</p>
     * 
     * <strong>example:</strong>
     * <p>starting</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("TargetResourceGroupName")
    public String targetResourceGroupName;

    public static ModifyDBResourceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourceGroupShrinkRequest self = new ModifyDBResourceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourceGroupShrinkRequest setAtmConfigShrink(String atmConfigShrink) {
        this.atmConfigShrink = atmConfigShrink;
        return this;
    }
    public String getAtmConfigShrink() {
        return this.atmConfigShrink;
    }

    public ModifyDBResourceGroupShrinkRequest setAutoStopInterval(String autoStopInterval) {
        this.autoStopInterval = autoStopInterval;
        return this;
    }
    public String getAutoStopInterval() {
        return this.autoStopInterval;
    }

    public ModifyDBResourceGroupShrinkRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public ModifyDBResourceGroupShrinkRequest setClusterSizeResource(String clusterSizeResource) {
        this.clusterSizeResource = clusterSizeResource;
        return this;
    }
    public String getClusterSizeResource() {
        return this.clusterSizeResource;
    }

    public ModifyDBResourceGroupShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBResourceGroupShrinkRequest setEnableSpot(Boolean enableSpot) {
        this.enableSpot = enableSpot;
        return this;
    }
    public Boolean getEnableSpot() {
        return this.enableSpot;
    }

    public ModifyDBResourceGroupShrinkRequest setEngineParamsShrink(String engineParamsShrink) {
        this.engineParamsShrink = engineParamsShrink;
        return this;
    }
    public String getEngineParamsShrink() {
        return this.engineParamsShrink;
    }

    public ModifyDBResourceGroupShrinkRequest setGpuElasticPlanShrink(String gpuElasticPlanShrink) {
        this.gpuElasticPlanShrink = gpuElasticPlanShrink;
        return this;
    }
    public String getGpuElasticPlanShrink() {
        return this.gpuElasticPlanShrink;
    }

    public ModifyDBResourceGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDBResourceGroupShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ModifyDBResourceGroupShrinkRequest setMaxClusterCount(Integer maxClusterCount) {
        this.maxClusterCount = maxClusterCount;
        return this;
    }
    public Integer getMaxClusterCount() {
        return this.maxClusterCount;
    }

    public ModifyDBResourceGroupShrinkRequest setMaxComputeResource(String maxComputeResource) {
        this.maxComputeResource = maxComputeResource;
        return this;
    }
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    public ModifyDBResourceGroupShrinkRequest setMaxGpuQuantity(Integer maxGpuQuantity) {
        this.maxGpuQuantity = maxGpuQuantity;
        return this;
    }
    public Integer getMaxGpuQuantity() {
        return this.maxGpuQuantity;
    }

    public ModifyDBResourceGroupShrinkRequest setMinClusterCount(Integer minClusterCount) {
        this.minClusterCount = minClusterCount;
        return this;
    }
    public Integer getMinClusterCount() {
        return this.minClusterCount;
    }

    public ModifyDBResourceGroupShrinkRequest setMinComputeResource(String minComputeResource) {
        this.minComputeResource = minComputeResource;
        return this;
    }
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    public ModifyDBResourceGroupShrinkRequest setMinGpuQuantity(Integer minGpuQuantity) {
        this.minGpuQuantity = minGpuQuantity;
        return this;
    }
    public Integer getMinGpuQuantity() {
        return this.minGpuQuantity;
    }

    public ModifyDBResourceGroupShrinkRequest setRayConfigShrink(String rayConfigShrink) {
        this.rayConfigShrink = rayConfigShrink;
        return this;
    }
    public String getRayConfigShrink() {
        return this.rayConfigShrink;
    }

    public ModifyDBResourceGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBResourceGroupShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public ModifyDBResourceGroupShrinkRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public ModifyDBResourceGroupShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyDBResourceGroupShrinkRequest setTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }
    public String getTargetResourceGroupName() {
        return this.targetResourceGroupName;
    }

}
