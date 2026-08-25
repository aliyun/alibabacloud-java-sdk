// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateDBResourceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The PromQL resource group configuration.</p>
     */
    @NameInMap("AtmConfig")
    public String atmConfigShrink;

    /**
     * <p>The automatic stop interval, in minutes (m).</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("AutoStopInterval")
    public String autoStopInterval;

    /**
     * <p>The classification of the resource group. Valid values:</p>
     * <ul>
     * <li>SQL</li>
     * <li>SparkSQL</li>
     * <li>MultiCluster</li>
     * <li>AI</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("Classification")
    public String classification;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClusterSizeResource")
    public String clusterSizeResource;

    /**
     * <p>The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the spot instance feature for the resource group. After the spot instance feature is enabled, the unit price of resources is reduced, but the resources may be released. Only Job resource groups support this feature. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: enables the spot instance feature.</li>
     * <li><strong>False</strong>: disables the spot instance feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableSpot")
    public Boolean enableSpot;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
     * <li><strong>SparkWarehouse</strong>: the SparkWarehouse engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SparkWarehouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;spark.adb.version\&quot;:\&quot;3.5\&quot;}</p>
     */
    @NameInMap("EngineParams")
    public String engineParamsShrink;

    /**
     * <p>The GPU time-sharing elastic plan.</p>
     */
    @NameInMap("GpuElasticPlan")
    public String gpuElasticPlanShrink;

    /**
     * <p>The name of the resource group.</p>
     * <ul>
     * <li>The name can be up to 255 characters in length.</li>
     * <li>The name must start with a digit, an uppercase letter, or a lowercase letter.</li>
     * <li>The name can contain digits, uppercase letters, lowercase letters, hyphens (-), and underscores (_).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li><strong>Interactive</strong></li>
     * <li><strong>Job</strong><blockquote>
     * <p>For more information about resource groups of the Data Lakehouse Edition, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource group overview (Data Lakehouse Edition)</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Job</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("MaxClusterCount")
    public Integer maxClusterCount;

    /**
     * <p>The maximum reserved computing resources, in ACUs.</p>
     * <ul>
     * <li>If the resource group type is Interactive, the maximum reserved computing resources is the current unallocated resources of the cluster, with a step size of 16 ACUs.</li>
     * <li>If the resource group type is Job, the maximum reserved computing resources is the current unallocated resources of the cluster, with a step size of 8 ACUs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>48ACU</p>
     */
    @NameInMap("MaxComputeResource")
    public String maxComputeResource;

    /**
     * <p>The maximum number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxGpuQuantity")
    public Integer maxGpuQuantity;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("MinClusterCount")
    public Integer minClusterCount;

    /**
     * <p>The minimum reserved computing resources, in ACUs.</p>
     * <ul>
     * <li>If the resource group type is Interactive, the minimum reserved computing resources is 16 ACUs.</li>
     * <li>If the resource group type is Job, the minimum reserved computing resources is 0 ACUs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0ACU</p>
     */
    @NameInMap("MinComputeResource")
    public String minComputeResource;

    /**
     * <p>The minimum number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinGpuQuantity")
    public Integer minGpuQuantity;

    /**
     * <p>The Ray configuration information.</p>
     * <blockquote>
     * <p>This parameter is required when the resource group is an AI resource group and the corresponding engine is RayCluster.</p>
     * </blockquote>
     */
    @NameInMap("RayConfig")
    public String rayConfigShrink;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the region IDs of AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The job routing rules.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    /**
     * <p>The scaling policy of the resource group. Valid values:</p>
     * <ul>
     * <li>AutoScaling: enables the AutoScaling automatic scaling policy.</li>
     * <li>Disable: disables automatic scaling.</li>
     * <li>MultiCluster: enables the MultiCluster automatic scaling policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoScaling</p>
     */
    @NameInMap("ScalePolicy")
    public String scalePolicy;

    /**
     * <p>The specification name.</p>
     * 
     * <strong>example:</strong>
     * <p>ADB.MLLarge.2</p>
     */
    @NameInMap("SpecName")
    public String specName;

    /**
     * <p>The name of the target resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TargetResourceGroupName")
    public String targetResourceGroupName;

    public static CreateDBResourceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourceGroupShrinkRequest self = new CreateDBResourceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBResourceGroupShrinkRequest setAtmConfigShrink(String atmConfigShrink) {
        this.atmConfigShrink = atmConfigShrink;
        return this;
    }
    public String getAtmConfigShrink() {
        return this.atmConfigShrink;
    }

    public CreateDBResourceGroupShrinkRequest setAutoStopInterval(String autoStopInterval) {
        this.autoStopInterval = autoStopInterval;
        return this;
    }
    public String getAutoStopInterval() {
        return this.autoStopInterval;
    }

    public CreateDBResourceGroupShrinkRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public CreateDBResourceGroupShrinkRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public CreateDBResourceGroupShrinkRequest setClusterSizeResource(String clusterSizeResource) {
        this.clusterSizeResource = clusterSizeResource;
        return this;
    }
    public String getClusterSizeResource() {
        return this.clusterSizeResource;
    }

    public CreateDBResourceGroupShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBResourceGroupShrinkRequest setEnableSpot(Boolean enableSpot) {
        this.enableSpot = enableSpot;
        return this;
    }
    public Boolean getEnableSpot() {
        return this.enableSpot;
    }

    public CreateDBResourceGroupShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBResourceGroupShrinkRequest setEngineParamsShrink(String engineParamsShrink) {
        this.engineParamsShrink = engineParamsShrink;
        return this;
    }
    public String getEngineParamsShrink() {
        return this.engineParamsShrink;
    }

    public CreateDBResourceGroupShrinkRequest setGpuElasticPlanShrink(String gpuElasticPlanShrink) {
        this.gpuElasticPlanShrink = gpuElasticPlanShrink;
        return this;
    }
    public String getGpuElasticPlanShrink() {
        return this.gpuElasticPlanShrink;
    }

    public CreateDBResourceGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDBResourceGroupShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateDBResourceGroupShrinkRequest setMaxClusterCount(Integer maxClusterCount) {
        this.maxClusterCount = maxClusterCount;
        return this;
    }
    public Integer getMaxClusterCount() {
        return this.maxClusterCount;
    }

    public CreateDBResourceGroupShrinkRequest setMaxComputeResource(String maxComputeResource) {
        this.maxComputeResource = maxComputeResource;
        return this;
    }
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    public CreateDBResourceGroupShrinkRequest setMaxGpuQuantity(Integer maxGpuQuantity) {
        this.maxGpuQuantity = maxGpuQuantity;
        return this;
    }
    public Integer getMaxGpuQuantity() {
        return this.maxGpuQuantity;
    }

    public CreateDBResourceGroupShrinkRequest setMinClusterCount(Integer minClusterCount) {
        this.minClusterCount = minClusterCount;
        return this;
    }
    public Integer getMinClusterCount() {
        return this.minClusterCount;
    }

    public CreateDBResourceGroupShrinkRequest setMinComputeResource(String minComputeResource) {
        this.minComputeResource = minComputeResource;
        return this;
    }
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    public CreateDBResourceGroupShrinkRequest setMinGpuQuantity(Integer minGpuQuantity) {
        this.minGpuQuantity = minGpuQuantity;
        return this;
    }
    public Integer getMinGpuQuantity() {
        return this.minGpuQuantity;
    }

    public CreateDBResourceGroupShrinkRequest setRayConfigShrink(String rayConfigShrink) {
        this.rayConfigShrink = rayConfigShrink;
        return this;
    }
    public String getRayConfigShrink() {
        return this.rayConfigShrink;
    }

    public CreateDBResourceGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBResourceGroupShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public CreateDBResourceGroupShrinkRequest setScalePolicy(String scalePolicy) {
        this.scalePolicy = scalePolicy;
        return this;
    }
    public String getScalePolicy() {
        return this.scalePolicy;
    }

    public CreateDBResourceGroupShrinkRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public CreateDBResourceGroupShrinkRequest setTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }
    public String getTargetResourceGroupName() {
        return this.targetResourceGroupName;
    }

}
