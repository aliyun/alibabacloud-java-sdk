// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataBackupsRequest extends TeaModel {
    /**
     * <p>The ID of the backup set. If you specify the BackupId parameter, the details of the backup set are returned.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The backup mode. Valid values:</p>
     * <br>
     * <p>*   Automated: automatic backup</p>
     * <p>*   Manual: manual backup</p>
     * <br>
     * <p>If you do not specify this parameter, the records of the backup sets in all modes are returned.</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The status of the backup set. Valid values:</p>
     * <br>
     * <p>*   Success: The backup is complete.</p>
     * <p>*   Failed: The backup task fails.</p>
     * <br>
     * <p>If you do not specify this parameter, the records of the backup sets in all states are returned.</p>
     */
    @NameInMap("BackupStatus")
    public String backupStatus;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The type of the backup. Valid values:</p>
     * <br>
     * <p>*   DATA: full backup</p>
     * <p>*   RESTOREPOI: point-in-time backup</p>
     * <br>
     * <p>If you do not specify this parameter, the records of the full backup set are returned.</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return. The value must be an integer that is larger than 0. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <br>
     * <p>*   30</p>
     * <p>*   50</p>
     * <p>*   100</p>
     * <br>
     * <p>Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDataBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupsRequest self = new DescribeDataBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeDataBackupsRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeDataBackupsRequest setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public DescribeDataBackupsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDataBackupsRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DescribeDataBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDataBackupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataBackupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
