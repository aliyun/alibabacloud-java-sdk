// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBackupDataListRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>213064****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The backup method. Valid values:</p>
     * <ul>
     * <li><strong>Physical</strong></li>
     * <li><strong>Logical</strong></li>
     * <li><strong>Snapshot</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Snapshot</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The backup mode. Valid values:</p>
     * <ul>
     * <li><strong>Automated</strong></li>
     * <li><strong>Manual</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Automated</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The backup scale. Valid values:</p>
     * <ul>
     * <li><strong>DBInstance</strong></li>
     * <li><strong>DBTable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DBInstance</p>
     */
    @NameInMap("BackupScale")
    public String backupScale;

    /**
     * <p>The status of the backup set. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The backup succeeded.</li>
     * <li><strong>ERROR</strong>: The backup failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("BackupStatus")
    public String backupStatus;

    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>FullBackup</strong></li>
     * <li><strong>IncrementBackup</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullBackup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>This is a reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test****</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. The time follows the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-17T17:00:32Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether the cluster is deleted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InstanceIsDeleted")
    public Boolean instanceIsDeleted;

    /**
     * <p>The ID of the PolarDB for MySQL cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze3nrr64c5******</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region in which the original cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegion")
    public String instanceRegion;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the INTEGER data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the backup set resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The type of the backup scenario. Set the value to <strong>LEVEL_1</strong>, which indicates the level-1 backup of the region in which the PolarDB for MySQL cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>LEVEL_1</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-17T17:00:16Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeBackupDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDataListRequest self = new DescribeBackupDataListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDataListRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeBackupDataListRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public DescribeBackupDataListRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeBackupDataListRequest setBackupScale(String backupScale) {
        this.backupScale = backupScale;
        return this;
    }
    public String getBackupScale() {
        return this.backupScale;
    }

    public DescribeBackupDataListRequest setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public DescribeBackupDataListRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public DescribeBackupDataListRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeBackupDataListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBackupDataListRequest setInstanceIsDeleted(Boolean instanceIsDeleted) {
        this.instanceIsDeleted = instanceIsDeleted;
        return this;
    }
    public Boolean getInstanceIsDeleted() {
        return this.instanceIsDeleted;
    }

    public DescribeBackupDataListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeBackupDataListRequest setInstanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
        return this;
    }
    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    public DescribeBackupDataListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupDataListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupDataListRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public DescribeBackupDataListRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public DescribeBackupDataListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
