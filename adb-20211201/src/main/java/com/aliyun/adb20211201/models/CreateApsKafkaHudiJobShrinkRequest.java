// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsKafkaHudiJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aps</p>
     */
    @NameInMap("AcrossRole")
    public String acrossRole;

    /**
     * <strong>example:</strong>
     * <p>123************</p>
     */
    @NameInMap("AcrossUid")
    public String acrossUid;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AdvancedConfig")
    public String advancedConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Columns")
    public String columnsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("DataOutputFormat")
    public String dataOutputFormat;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>2ACU</p>
     */
    @NameInMap("FullComputeUnit")
    public String fullComputeUnit;

    /**
     * <strong>example:</strong>
     * <p>hoodie.keep.min.commits=20</p>
     */
    @NameInMap("HudiAdvancedConfig")
    public String hudiAdvancedConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ACU</p>
     */
    @NameInMap("IncrementalComputeUnit")
    public String incrementalComputeUnit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("JsonParseLevel")
    public Integer jsonParseLevel;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("KafkaClusterId")
    public String kafkaClusterId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KafkaTopic")
    public String kafkaTopic;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("LakehouseId")
    public Long lakehouseId;

    /**
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("MaxOffsetsPerTrigger")
    public Long maxOffsetsPerTrigger;

    /**
     * <strong>example:</strong>
     * <p>oss://test-xx-zzz/yyy/</p>
     */
    @NameInMap("OssLocation")
    public String ossLocation;

    /**
     * <strong>example:</strong>
     * <p>HUDI</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("PartitionSpecs")
    public String partitionSpecsShrink;

    /**
     * <strong>example:</strong>
     * <p>&quot;Strategy&quot;: &quot;mapping&quot;</p>
     */
    @NameInMap("PrimaryKeyDefinition")
    public String primaryKeyDefinition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aps</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>begincursor</p>
     */
    @NameInMap("StartingOffsets")
    public String startingOffsets;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testTB</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TargetGenerateRule")
    public String targetGenerateRule;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    public static CreateApsKafkaHudiJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsKafkaHudiJobShrinkRequest self = new CreateApsKafkaHudiJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsKafkaHudiJobShrinkRequest setAcrossRole(String acrossRole) {
        this.acrossRole = acrossRole;
        return this;
    }
    public String getAcrossRole() {
        return this.acrossRole;
    }

    public CreateApsKafkaHudiJobShrinkRequest setAcrossUid(String acrossUid) {
        this.acrossUid = acrossUid;
        return this;
    }
    public String getAcrossUid() {
        return this.acrossUid;
    }

    public CreateApsKafkaHudiJobShrinkRequest setAdvancedConfig(String advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    public CreateApsKafkaHudiJobShrinkRequest setColumnsShrink(String columnsShrink) {
        this.columnsShrink = columnsShrink;
        return this;
    }
    public String getColumnsShrink() {
        return this.columnsShrink;
    }

    public CreateApsKafkaHudiJobShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsKafkaHudiJobShrinkRequest setDataOutputFormat(String dataOutputFormat) {
        this.dataOutputFormat = dataOutputFormat;
        return this;
    }
    public String getDataOutputFormat() {
        return this.dataOutputFormat;
    }

    public CreateApsKafkaHudiJobShrinkRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public CreateApsKafkaHudiJobShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateApsKafkaHudiJobShrinkRequest setFullComputeUnit(String fullComputeUnit) {
        this.fullComputeUnit = fullComputeUnit;
        return this;
    }
    public String getFullComputeUnit() {
        return this.fullComputeUnit;
    }

    public CreateApsKafkaHudiJobShrinkRequest setHudiAdvancedConfig(String hudiAdvancedConfig) {
        this.hudiAdvancedConfig = hudiAdvancedConfig;
        return this;
    }
    public String getHudiAdvancedConfig() {
        return this.hudiAdvancedConfig;
    }

    public CreateApsKafkaHudiJobShrinkRequest setIncrementalComputeUnit(String incrementalComputeUnit) {
        this.incrementalComputeUnit = incrementalComputeUnit;
        return this;
    }
    public String getIncrementalComputeUnit() {
        return this.incrementalComputeUnit;
    }

    public CreateApsKafkaHudiJobShrinkRequest setJsonParseLevel(Integer jsonParseLevel) {
        this.jsonParseLevel = jsonParseLevel;
        return this;
    }
    public Integer getJsonParseLevel() {
        return this.jsonParseLevel;
    }

    public CreateApsKafkaHudiJobShrinkRequest setKafkaClusterId(String kafkaClusterId) {
        this.kafkaClusterId = kafkaClusterId;
        return this;
    }
    public String getKafkaClusterId() {
        return this.kafkaClusterId;
    }

    public CreateApsKafkaHudiJobShrinkRequest setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }
    public String getKafkaTopic() {
        return this.kafkaTopic;
    }

    public CreateApsKafkaHudiJobShrinkRequest setLakehouseId(Long lakehouseId) {
        this.lakehouseId = lakehouseId;
        return this;
    }
    public Long getLakehouseId() {
        return this.lakehouseId;
    }

    public CreateApsKafkaHudiJobShrinkRequest setMaxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
        this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
        return this;
    }
    public Long getMaxOffsetsPerTrigger() {
        return this.maxOffsetsPerTrigger;
    }

    public CreateApsKafkaHudiJobShrinkRequest setOssLocation(String ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public String getOssLocation() {
        return this.ossLocation;
    }

    public CreateApsKafkaHudiJobShrinkRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public CreateApsKafkaHudiJobShrinkRequest setPartitionSpecsShrink(String partitionSpecsShrink) {
        this.partitionSpecsShrink = partitionSpecsShrink;
        return this;
    }
    public String getPartitionSpecsShrink() {
        return this.partitionSpecsShrink;
    }

    public CreateApsKafkaHudiJobShrinkRequest setPrimaryKeyDefinition(String primaryKeyDefinition) {
        this.primaryKeyDefinition = primaryKeyDefinition;
        return this;
    }
    public String getPrimaryKeyDefinition() {
        return this.primaryKeyDefinition;
    }

    public CreateApsKafkaHudiJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsKafkaHudiJobShrinkRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public CreateApsKafkaHudiJobShrinkRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public CreateApsKafkaHudiJobShrinkRequest setStartingOffsets(String startingOffsets) {
        this.startingOffsets = startingOffsets;
        return this;
    }
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    public CreateApsKafkaHudiJobShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateApsKafkaHudiJobShrinkRequest setTargetGenerateRule(String targetGenerateRule) {
        this.targetGenerateRule = targetGenerateRule;
        return this;
    }
    public String getTargetGenerateRule() {
        return this.targetGenerateRule;
    }

    public CreateApsKafkaHudiJobShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateApsKafkaHudiJobShrinkRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

}
