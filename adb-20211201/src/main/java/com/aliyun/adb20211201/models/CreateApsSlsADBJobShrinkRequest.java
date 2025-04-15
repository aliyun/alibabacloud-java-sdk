// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsSlsADBJobShrinkRequest extends TeaModel {
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
    public String columnsShrink;

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
    public String partitionSpecsShrink;

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
    public String unixTimestampConvertShrink;

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

    public static CreateApsSlsADBJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsSlsADBJobShrinkRequest self = new CreateApsSlsADBJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsSlsADBJobShrinkRequest setAcrossRole(String acrossRole) {
        this.acrossRole = acrossRole;
        return this;
    }
    public String getAcrossRole() {
        return this.acrossRole;
    }

    public CreateApsSlsADBJobShrinkRequest setAcrossUid(String acrossUid) {
        this.acrossUid = acrossUid;
        return this;
    }
    public String getAcrossUid() {
        return this.acrossUid;
    }

    public CreateApsSlsADBJobShrinkRequest setAdvancedConfig(String advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    public CreateApsSlsADBJobShrinkRequest setColumnsShrink(String columnsShrink) {
        this.columnsShrink = columnsShrink;
        return this;
    }
    public String getColumnsShrink() {
        return this.columnsShrink;
    }

    public CreateApsSlsADBJobShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsSlsADBJobShrinkRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public CreateApsSlsADBJobShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateApsSlsADBJobShrinkRequest setDirtyDataHandleMode(String dirtyDataHandleMode) {
        this.dirtyDataHandleMode = dirtyDataHandleMode;
        return this;
    }
    public String getDirtyDataHandleMode() {
        return this.dirtyDataHandleMode;
    }

    public CreateApsSlsADBJobShrinkRequest setDirtyDataProcessPattern(String dirtyDataProcessPattern) {
        this.dirtyDataProcessPattern = dirtyDataProcessPattern;
        return this;
    }
    public String getDirtyDataProcessPattern() {
        return this.dirtyDataProcessPattern;
    }

    public CreateApsSlsADBJobShrinkRequest setExactlyOnce(String exactlyOnce) {
        this.exactlyOnce = exactlyOnce;
        return this;
    }
    public String getExactlyOnce() {
        return this.exactlyOnce;
    }

    public CreateApsSlsADBJobShrinkRequest setFullComputeUnit(String fullComputeUnit) {
        this.fullComputeUnit = fullComputeUnit;
        return this;
    }
    public String getFullComputeUnit() {
        return this.fullComputeUnit;
    }

    public CreateApsSlsADBJobShrinkRequest setHudiAdvancedConfig(String hudiAdvancedConfig) {
        this.hudiAdvancedConfig = hudiAdvancedConfig;
        return this;
    }
    public String getHudiAdvancedConfig() {
        return this.hudiAdvancedConfig;
    }

    public CreateApsSlsADBJobShrinkRequest setIncrementalComputeUnit(String incrementalComputeUnit) {
        this.incrementalComputeUnit = incrementalComputeUnit;
        return this;
    }
    public String getIncrementalComputeUnit() {
        return this.incrementalComputeUnit;
    }

    public CreateApsSlsADBJobShrinkRequest setLakehouseId(Long lakehouseId) {
        this.lakehouseId = lakehouseId;
        return this;
    }
    public Long getLakehouseId() {
        return this.lakehouseId;
    }

    public CreateApsSlsADBJobShrinkRequest setMaxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
        this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
        return this;
    }
    public Long getMaxOffsetsPerTrigger() {
        return this.maxOffsetsPerTrigger;
    }

    public CreateApsSlsADBJobShrinkRequest setOssLocation(String ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public String getOssLocation() {
        return this.ossLocation;
    }

    public CreateApsSlsADBJobShrinkRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public CreateApsSlsADBJobShrinkRequest setPartitionSpecsShrink(String partitionSpecsShrink) {
        this.partitionSpecsShrink = partitionSpecsShrink;
        return this;
    }
    public String getPartitionSpecsShrink() {
        return this.partitionSpecsShrink;
    }

    public CreateApsSlsADBJobShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateApsSlsADBJobShrinkRequest setPrimaryKeyDefinition(String primaryKeyDefinition) {
        this.primaryKeyDefinition = primaryKeyDefinition;
        return this;
    }
    public String getPrimaryKeyDefinition() {
        return this.primaryKeyDefinition;
    }

    public CreateApsSlsADBJobShrinkRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateApsSlsADBJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsSlsADBJobShrinkRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public CreateApsSlsADBJobShrinkRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public CreateApsSlsADBJobShrinkRequest setStartingOffsets(String startingOffsets) {
        this.startingOffsets = startingOffsets;
        return this;
    }
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    public CreateApsSlsADBJobShrinkRequest setStore(String store) {
        this.store = store;
        return this;
    }
    public String getStore() {
        return this.store;
    }

    public CreateApsSlsADBJobShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateApsSlsADBJobShrinkRequest setTargetGenerateRule(String targetGenerateRule) {
        this.targetGenerateRule = targetGenerateRule;
        return this;
    }
    public String getTargetGenerateRule() {
        return this.targetGenerateRule;
    }

    public CreateApsSlsADBJobShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateApsSlsADBJobShrinkRequest setUnixTimestampConvertShrink(String unixTimestampConvertShrink) {
        this.unixTimestampConvertShrink = unixTimestampConvertShrink;
        return this;
    }
    public String getUnixTimestampConvertShrink() {
        return this.unixTimestampConvertShrink;
    }

    public CreateApsSlsADBJobShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateApsSlsADBJobShrinkRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

}
