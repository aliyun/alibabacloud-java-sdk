// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsKafkaHudiJobRequest extends TeaModel {
    /**
     * <p>The Resource Access Management (RAM) role that is created for the trusted Alibaba Cloud account. For more information, see Create a RAM role for a trusted Alibaba Cloud account. The ARN of the RAM role that grants AnalyticDB for MySQL permission to access resources in the source account. Required for cross-account data ingestion.</p>
     * 
     * <strong>example:</strong>
     * <p>aps</p>
     */
    @NameInMap("AcrossRole")
    public String acrossRole;

    /**
     * <p>The ID of the Alibaba Cloud account to which the source Kafka belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>123************</p>
     */
    @NameInMap("AcrossUid")
    public String acrossUid;

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
     * <p>The column information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Columns")
    public java.util.List<CreateApsKafkaHudiJobRequestColumns> columns;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all clusters in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Enumeration value and description. Single: The source is a single-row JSON record. Multi: source is a JSON array. Output a single JSON record.</p>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("DataOutputFormat")
    public String dataOutputFormat;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    /**
     * <p>The name of the user-defined database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The full synchronization configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>2ACU</p>
     */
    @NameInMap("FullComputeUnit")
    public String fullComputeUnit;

    /**
     * <p>The HUDI configuration of the destination.</p>
     * 
     * <strong>example:</strong>
     * <p>hoodie.keep.min.commits=20</p>
     */
    @NameInMap("HudiAdvancedConfig")
    public String hudiAdvancedConfig;

    /**
     * <p>The incremental synchronization configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ACU</p>
     */
    @NameInMap("IncrementalComputeUnit")
    public String incrementalComputeUnit;

    /**
     * <p>The number of layers that are parsed for nested JSON fields. Valid values: 0: Nested JSON fields are not parsed. 1: parses one layer. 2: Two layers are parsed. 3: Three layers are parsed. 4: Four layers are parsed. By default, one layer is parsed. For more information about how nested JSON fields are parsed, see the Examples of schema fields parsed with different numbers of layers section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("JsonParseLevel")
    public Integer jsonParseLevel;

    /**
     * <p>The ID of the Apache Kafka instance. You can get it in the Kafka console.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("KafkaClusterId")
    public String kafkaClusterId;

    /**
     * <p>Kafka Topic ID. You can get it in the Kafka console.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KafkaTopic")
    public String kafkaTopic;

    /**
     * <p>The ID of the lakehouse.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("LakehouseId")
    public Long lakehouseId;

    /**
     * <p>The maximum number of records to fetch in a single batch.</p>
     * 
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("MaxOffsetsPerTrigger")
    public Long maxOffsetsPerTrigger;

    /**
     * <p>The path of the destination data lakehouse in an Object Storage Service (OSS) bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-xx-zzz/yyy/</p>
     */
    @NameInMap("OssLocation")
    public String ossLocation;

    /**
     * <p>The format of the output data.</p>
     * 
     * <strong>example:</strong>
     * <p>HUDI</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>The partition information.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("PartitionSpecs")
    public java.util.List<java.util.Map<String, ?>> partitionSpecs;

    /**
     * <p>The primary key settings. Contains the uuid policy and mapping policy. The explanation is as follows. Uuid policy: &quot;Strategy&quot;: &quot;uuid&quot;. Mapping policy: &quot;Strategy&quot;: &quot;mapping&quot;, &quot;Values&quot;:[ &quot;f1&quot;, &quot;f2&quot; ], &quot;RecordVersionField&quot;,&quot;xxx&quot; The meaning of the RecordVersionField is the HUDI record version.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Strategy&quot;: &quot;mapping&quot;</p>
     */
    @NameInMap("PrimaryKeyDefinition")
    public String primaryKeyDefinition;

    /**
     * <p>The region ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aps</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>地域ID。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <p>Specifies the position from which to start consuming messages. Valid values: begin_cursor/end_cursor/timestamp Each corresponds to the earliest /latest /specified time respectively.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>begincursor</p>
     */
    @NameInMap("StartingOffsets")
    public String startingOffsets;

    /**
     * <p>The name of the user-defined table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testTB</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The rules for generating the destination database.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TargetGenerateRule")
    public String targetGenerateRule;

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
     * <p>test</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    public static CreateApsKafkaHudiJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsKafkaHudiJobRequest self = new CreateApsKafkaHudiJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsKafkaHudiJobRequest setAcrossRole(String acrossRole) {
        this.acrossRole = acrossRole;
        return this;
    }
    public String getAcrossRole() {
        return this.acrossRole;
    }

    public CreateApsKafkaHudiJobRequest setAcrossUid(String acrossUid) {
        this.acrossUid = acrossUid;
        return this;
    }
    public String getAcrossUid() {
        return this.acrossUid;
    }

    public CreateApsKafkaHudiJobRequest setAdvancedConfig(String advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    public CreateApsKafkaHudiJobRequest setColumns(java.util.List<CreateApsKafkaHudiJobRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<CreateApsKafkaHudiJobRequestColumns> getColumns() {
        return this.columns;
    }

    public CreateApsKafkaHudiJobRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsKafkaHudiJobRequest setDataOutputFormat(String dataOutputFormat) {
        this.dataOutputFormat = dataOutputFormat;
        return this;
    }
    public String getDataOutputFormat() {
        return this.dataOutputFormat;
    }

    public CreateApsKafkaHudiJobRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public CreateApsKafkaHudiJobRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateApsKafkaHudiJobRequest setFullComputeUnit(String fullComputeUnit) {
        this.fullComputeUnit = fullComputeUnit;
        return this;
    }
    public String getFullComputeUnit() {
        return this.fullComputeUnit;
    }

    public CreateApsKafkaHudiJobRequest setHudiAdvancedConfig(String hudiAdvancedConfig) {
        this.hudiAdvancedConfig = hudiAdvancedConfig;
        return this;
    }
    public String getHudiAdvancedConfig() {
        return this.hudiAdvancedConfig;
    }

    public CreateApsKafkaHudiJobRequest setIncrementalComputeUnit(String incrementalComputeUnit) {
        this.incrementalComputeUnit = incrementalComputeUnit;
        return this;
    }
    public String getIncrementalComputeUnit() {
        return this.incrementalComputeUnit;
    }

    public CreateApsKafkaHudiJobRequest setJsonParseLevel(Integer jsonParseLevel) {
        this.jsonParseLevel = jsonParseLevel;
        return this;
    }
    public Integer getJsonParseLevel() {
        return this.jsonParseLevel;
    }

    public CreateApsKafkaHudiJobRequest setKafkaClusterId(String kafkaClusterId) {
        this.kafkaClusterId = kafkaClusterId;
        return this;
    }
    public String getKafkaClusterId() {
        return this.kafkaClusterId;
    }

    public CreateApsKafkaHudiJobRequest setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }
    public String getKafkaTopic() {
        return this.kafkaTopic;
    }

    public CreateApsKafkaHudiJobRequest setLakehouseId(Long lakehouseId) {
        this.lakehouseId = lakehouseId;
        return this;
    }
    public Long getLakehouseId() {
        return this.lakehouseId;
    }

    public CreateApsKafkaHudiJobRequest setMaxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
        this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
        return this;
    }
    public Long getMaxOffsetsPerTrigger() {
        return this.maxOffsetsPerTrigger;
    }

    public CreateApsKafkaHudiJobRequest setOssLocation(String ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public String getOssLocation() {
        return this.ossLocation;
    }

    public CreateApsKafkaHudiJobRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public CreateApsKafkaHudiJobRequest setPartitionSpecs(java.util.List<java.util.Map<String, ?>> partitionSpecs) {
        this.partitionSpecs = partitionSpecs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public CreateApsKafkaHudiJobRequest setPrimaryKeyDefinition(String primaryKeyDefinition) {
        this.primaryKeyDefinition = primaryKeyDefinition;
        return this;
    }
    public String getPrimaryKeyDefinition() {
        return this.primaryKeyDefinition;
    }

    public CreateApsKafkaHudiJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsKafkaHudiJobRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public CreateApsKafkaHudiJobRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public CreateApsKafkaHudiJobRequest setStartingOffsets(String startingOffsets) {
        this.startingOffsets = startingOffsets;
        return this;
    }
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    public CreateApsKafkaHudiJobRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateApsKafkaHudiJobRequest setTargetGenerateRule(String targetGenerateRule) {
        this.targetGenerateRule = targetGenerateRule;
        return this;
    }
    public String getTargetGenerateRule() {
        return this.targetGenerateRule;
    }

    public CreateApsKafkaHudiJobRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateApsKafkaHudiJobRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

    public static class CreateApsKafkaHudiJobRequestColumns extends TeaModel {
        /**
         * <p>The name of the partition column in the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>b</p>
         */
        @NameInMap("MapName")
        public String mapName;

        /**
         * <p>The desired format for the destination partition column.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("MapType")
        public String mapType;

        /**
         * <p>The name of the source column to use for partitioning.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The format of the source field. See the table below for valid values.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateApsKafkaHudiJobRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateApsKafkaHudiJobRequestColumns self = new CreateApsKafkaHudiJobRequestColumns();
            return TeaModel.build(map, self);
        }

        public CreateApsKafkaHudiJobRequestColumns setMapName(String mapName) {
            this.mapName = mapName;
            return this;
        }
        public String getMapName() {
            return this.mapName;
        }

        public CreateApsKafkaHudiJobRequestColumns setMapType(String mapType) {
            this.mapType = mapType;
            return this;
        }
        public String getMapType() {
            return this.mapType;
        }

        public CreateApsKafkaHudiJobRequestColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApsKafkaHudiJobRequestColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
