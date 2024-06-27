// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataBackupsRequest extends TeaModel {
    /**
     * <p>The ID of the backup set. If you specify BackupId, the details of the backup set are returned.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the information about all backup sets of an instance, including backup set IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>327329803</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The backup mode. Valid values:</p>
     * <ul>
     * <li>Automated</li>
     * <li>Manual</li>
     * </ul>
     * <p>If you do not specify this parameter, all backup sets are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The state of the backup set. Valid values:</p>
     * <ul>
     * <li>Success</li>
     * <li>Failed</li>
     * </ul>
     * <p>If you do not specify this parameter, all backup sets are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("BackupStatus")
    public String backupStatus;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>DATA</strong>: full backup.</li>
     * <li><strong>RESTOREPOI</strong>: point-in-time recovery backup.</li>
     * </ul>
     * <p>If you do not specify this parameter, the backup sets of full backup are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2011-06-01T16:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li>30</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2011-06-01T15:00Z</p>
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
