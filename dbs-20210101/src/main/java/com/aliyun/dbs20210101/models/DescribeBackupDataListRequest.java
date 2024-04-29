// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBackupDataListRequest extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("BackupScale")
    public String backupScale;

    @NameInMap("BackupStatus")
    public String backupStatus;

    @NameInMap("BackupType")
    public String backupType;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceIsDeleted")
    public Boolean instanceIsDeleted;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceRegion")
    public String instanceRegion;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("SceneType")
    public String sceneType;

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
