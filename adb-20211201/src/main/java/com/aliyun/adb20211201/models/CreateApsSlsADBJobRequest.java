// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsSlsADBJobRequest extends TeaModel {
    /**
     * <p>The name of the cross-account role.</p>
     * 
     * <strong>example:</strong>
     * <p>test-role</p>
     */
    @NameInMap("AcrossRole")
    public String acrossRole;

    /**
     * <p>The cross-account UID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
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
     * <p>The information about columns.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Columns")
    public java.util.List<CreateApsSlsADBJobRequestColumns> columns;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-*********</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>327</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbName</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The dirty data processing mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DirtyDataHandleMode")
    public String dirtyDataHandleMode;

    /**
     * <p>The dirty data processing mode.</p>
     * 
     * <strong>example:</strong>
     * <p>STOP</p>
     */
    @NameInMap("DirtyDataProcessPattern")
    public String dirtyDataProcessPattern;

    /**
     * <p>Specifies whether to enable the consistency check.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExactlyOnce")
    public String exactlyOnce;

    /**
     * <p>The number of full AnalyticDB compute units (ACUs).</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("FullComputeUnit")
    public String fullComputeUnit;

    /**
     * <p>The advanced configurations of Hudi.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("HudiAdvancedConfig")
    public String hudiAdvancedConfig;

    /**
     * <p>The number of increment ACUs.</p>
     * 
     * <strong>example:</strong>
     * <p>168</p>
     */
    @NameInMap("IncrementalComputeUnit")
    public String incrementalComputeUnit;

    /**
     * <p>The lakehouse ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("LakehouseId")
    public Long lakehouseId;

    /**
     * <p>The latest offset.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("MaxOffsetsPerTrigger")
    public Long maxOffsetsPerTrigger;

    /**
     * <p>The Object Storage Service (OSS) URL.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test*</p>
     */
    @NameInMap("OssLocation")
    public String ossLocation;

    /**
     * <p>The format of the output file.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>The information about partition.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PartitionSpecs")
    public java.util.List<java.util.Map<String, ?>> partitionSpecs;

    /**
     * <p>The password of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The definition of the primary key.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PrimaryKeyDefinition")
    public String primaryKeyDefinition;

    /**
     * <p>The name of the SLS project.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The region ID of the source cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <p>The start offset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StartingOffsets")
    public String startingOffsets;

    /**
     * <p>The SLS Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Store")
    public String store;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The rules for generating the destination database.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("TargetGenerateRule")
    public String targetGenerateRule;

    /**
     * <p>The destination type.</p>
     * 
     * <strong>example:</strong>
     * <p>ADB</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The timestamp conversion.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("UnixTimestampConvert")
    public CreateApsSlsADBJobRequestUnixTimestampConvert unixTimestampConvert;

    /**
     * <p>The name of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_test</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The name of the workload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-******</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    public static CreateApsSlsADBJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsSlsADBJobRequest self = new CreateApsSlsADBJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsSlsADBJobRequest setAcrossRole(String acrossRole) {
        this.acrossRole = acrossRole;
        return this;
    }
    public String getAcrossRole() {
        return this.acrossRole;
    }

    public CreateApsSlsADBJobRequest setAcrossUid(String acrossUid) {
        this.acrossUid = acrossUid;
        return this;
    }
    public String getAcrossUid() {
        return this.acrossUid;
    }

    public CreateApsSlsADBJobRequest setAdvancedConfig(String advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    public CreateApsSlsADBJobRequest setColumns(java.util.List<CreateApsSlsADBJobRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<CreateApsSlsADBJobRequestColumns> getColumns() {
        return this.columns;
    }

    public CreateApsSlsADBJobRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsSlsADBJobRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public CreateApsSlsADBJobRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateApsSlsADBJobRequest setDirtyDataHandleMode(String dirtyDataHandleMode) {
        this.dirtyDataHandleMode = dirtyDataHandleMode;
        return this;
    }
    public String getDirtyDataHandleMode() {
        return this.dirtyDataHandleMode;
    }

    public CreateApsSlsADBJobRequest setDirtyDataProcessPattern(String dirtyDataProcessPattern) {
        this.dirtyDataProcessPattern = dirtyDataProcessPattern;
        return this;
    }
    public String getDirtyDataProcessPattern() {
        return this.dirtyDataProcessPattern;
    }

    public CreateApsSlsADBJobRequest setExactlyOnce(String exactlyOnce) {
        this.exactlyOnce = exactlyOnce;
        return this;
    }
    public String getExactlyOnce() {
        return this.exactlyOnce;
    }

    public CreateApsSlsADBJobRequest setFullComputeUnit(String fullComputeUnit) {
        this.fullComputeUnit = fullComputeUnit;
        return this;
    }
    public String getFullComputeUnit() {
        return this.fullComputeUnit;
    }

    public CreateApsSlsADBJobRequest setHudiAdvancedConfig(String hudiAdvancedConfig) {
        this.hudiAdvancedConfig = hudiAdvancedConfig;
        return this;
    }
    public String getHudiAdvancedConfig() {
        return this.hudiAdvancedConfig;
    }

    public CreateApsSlsADBJobRequest setIncrementalComputeUnit(String incrementalComputeUnit) {
        this.incrementalComputeUnit = incrementalComputeUnit;
        return this;
    }
    public String getIncrementalComputeUnit() {
        return this.incrementalComputeUnit;
    }

    public CreateApsSlsADBJobRequest setLakehouseId(Long lakehouseId) {
        this.lakehouseId = lakehouseId;
        return this;
    }
    public Long getLakehouseId() {
        return this.lakehouseId;
    }

    public CreateApsSlsADBJobRequest setMaxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
        this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
        return this;
    }
    public Long getMaxOffsetsPerTrigger() {
        return this.maxOffsetsPerTrigger;
    }

    public CreateApsSlsADBJobRequest setOssLocation(String ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public String getOssLocation() {
        return this.ossLocation;
    }

    public CreateApsSlsADBJobRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public CreateApsSlsADBJobRequest setPartitionSpecs(java.util.List<java.util.Map<String, ?>> partitionSpecs) {
        this.partitionSpecs = partitionSpecs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public CreateApsSlsADBJobRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateApsSlsADBJobRequest setPrimaryKeyDefinition(String primaryKeyDefinition) {
        this.primaryKeyDefinition = primaryKeyDefinition;
        return this;
    }
    public String getPrimaryKeyDefinition() {
        return this.primaryKeyDefinition;
    }

    public CreateApsSlsADBJobRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateApsSlsADBJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsSlsADBJobRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public CreateApsSlsADBJobRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public CreateApsSlsADBJobRequest setStartingOffsets(String startingOffsets) {
        this.startingOffsets = startingOffsets;
        return this;
    }
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    public CreateApsSlsADBJobRequest setStore(String store) {
        this.store = store;
        return this;
    }
    public String getStore() {
        return this.store;
    }

    public CreateApsSlsADBJobRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateApsSlsADBJobRequest setTargetGenerateRule(String targetGenerateRule) {
        this.targetGenerateRule = targetGenerateRule;
        return this;
    }
    public String getTargetGenerateRule() {
        return this.targetGenerateRule;
    }

    public CreateApsSlsADBJobRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateApsSlsADBJobRequest setUnixTimestampConvert(CreateApsSlsADBJobRequestUnixTimestampConvert unixTimestampConvert) {
        this.unixTimestampConvert = unixTimestampConvert;
        return this;
    }
    public CreateApsSlsADBJobRequestUnixTimestampConvert getUnixTimestampConvert() {
        return this.unixTimestampConvert;
    }

    public CreateApsSlsADBJobRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateApsSlsADBJobRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

    public static class CreateApsSlsADBJobRequestColumns extends TeaModel {
        /**
         * <p>The name of the mapping.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MapName")
        public String mapName;

        /**
         * <p>The type of the mapping.</p>
         * 
         * <strong>example:</strong>
         * <p>int</p>
         */
        @NameInMap("MapType")
        public String mapType;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateApsSlsADBJobRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateApsSlsADBJobRequestColumns self = new CreateApsSlsADBJobRequestColumns();
            return TeaModel.build(map, self);
        }

        public CreateApsSlsADBJobRequestColumns setMapName(String mapName) {
            this.mapName = mapName;
            return this;
        }
        public String getMapName() {
            return this.mapName;
        }

        public CreateApsSlsADBJobRequestColumns setMapType(String mapType) {
            this.mapType = mapType;
            return this;
        }
        public String getMapType() {
            return this.mapType;
        }

        public CreateApsSlsADBJobRequestColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApsSlsADBJobRequestColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateApsSlsADBJobRequestUnixTimestampConvert extends TeaModel {
        /**
         * <p>Specifies whether to enable the conversion of timestamps.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Convert")
        public String convert;

        /**
         * <p>The format of the timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p> APSyyyyMMdd</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Specifies whether to enable the timestamp conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Transform")
        public Boolean transform;

        public static CreateApsSlsADBJobRequestUnixTimestampConvert build(java.util.Map<String, ?> map) throws Exception {
            CreateApsSlsADBJobRequestUnixTimestampConvert self = new CreateApsSlsADBJobRequestUnixTimestampConvert();
            return TeaModel.build(map, self);
        }

        public CreateApsSlsADBJobRequestUnixTimestampConvert setConvert(String convert) {
            this.convert = convert;
            return this;
        }
        public String getConvert() {
            return this.convert;
        }

        public CreateApsSlsADBJobRequestUnixTimestampConvert setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateApsSlsADBJobRequestUnixTimestampConvert setTransform(Boolean transform) {
            this.transform = transform;
            return this;
        }
        public Boolean getTransform() {
            return this.transform;
        }

    }

}
