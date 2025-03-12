// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsHiveJobRequest extends TeaModel {
    /**
     * <p>The advanced configurations.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AdvancedConfig")
    public String advancedConfig;

    /**
     * <p>The policy to handle tables with the same name in the destination cluster.</p>
     */
    @NameInMap("ConflictStrategy")
    public String conflictStrategy;

    /**
     * <p>The ID of the AnalyticDB for MySQL cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    /**
     * <p>The number of AnalyticDB compute units (ACUs) required for data migration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("FullComputeUnit")
    public String fullComputeUnit;

    /**
     * <p>The path of the destination data lakehouse in an Object Storage Service (OSS) bucket.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssLocation")
    public String ossLocation;

    /**
     * <p>The number of tasks that are allowed in parallel.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Parallelism")
    public Integer parallelism;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The expression that allows objects to be synchronized.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("SyncAllowExpression")
    public String syncAllowExpression;

    /**
     * <p>The expression that denies objects to be synchronized.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("SyncDenyExpression")
    public String syncDenyExpression;

    /**
     * <p>The destination type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The name of the workload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-20240224100253</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    public static CreateApsHiveJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsHiveJobRequest self = new CreateApsHiveJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsHiveJobRequest setAdvancedConfig(String advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    public CreateApsHiveJobRequest setConflictStrategy(String conflictStrategy) {
        this.conflictStrategy = conflictStrategy;
        return this;
    }
    public String getConflictStrategy() {
        return this.conflictStrategy;
    }

    public CreateApsHiveJobRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsHiveJobRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public CreateApsHiveJobRequest setFullComputeUnit(String fullComputeUnit) {
        this.fullComputeUnit = fullComputeUnit;
        return this;
    }
    public String getFullComputeUnit() {
        return this.fullComputeUnit;
    }

    public CreateApsHiveJobRequest setOssLocation(String ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public String getOssLocation() {
        return this.ossLocation;
    }

    public CreateApsHiveJobRequest setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Integer getParallelism() {
        return this.parallelism;
    }

    public CreateApsHiveJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsHiveJobRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public CreateApsHiveJobRequest setSyncAllowExpression(String syncAllowExpression) {
        this.syncAllowExpression = syncAllowExpression;
        return this;
    }
    public String getSyncAllowExpression() {
        return this.syncAllowExpression;
    }

    public CreateApsHiveJobRequest setSyncDenyExpression(String syncDenyExpression) {
        this.syncDenyExpression = syncDenyExpression;
        return this;
    }
    public String getSyncDenyExpression() {
        return this.syncDenyExpression;
    }

    public CreateApsHiveJobRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateApsHiveJobRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

}
