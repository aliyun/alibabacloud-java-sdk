// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataBackupsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataBackupsResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E387971-33A5-5019-AD7F-DC**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total backup set size. Unit: Byte.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("TotalBackupSize")
    public Long totalBackupSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupsResponseBody self = new DescribeDataBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupsResponseBody setItems(java.util.List<DescribeDataBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataBackupsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataBackupsResponseBody setTotalBackupSize(Long totalBackupSize) {
        this.totalBackupSize = totalBackupSize;
        return this;
    }
    public Long getTotalBackupSize() {
        return this.totalBackupSize;
    }

    public DescribeDataBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataBackupsResponseBodyItems extends TeaModel {
        /**
         * <p>The UTC time when the backup ended. The time is in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-22T12:01:43Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The local time when the backup ended. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-22 20:00:25</p>
         */
        @NameInMap("BackupEndTimeLocal")
        public String backupEndTimeLocal;

        /**
         * <p>The method that is used to generate the backup set. Valid values:</p>
         * <ul>
         * <li><strong>Logical</strong>: logical backup</li>
         * <li><strong>Physical</strong>: physical backup</li>
         * <li><strong>Snapshot</strong>: snapshot backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Physical</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode.</p>
         * <p>Valid values for full backup:</p>
         * <ul>
         * <li>Automated: automatic backup</li>
         * <li>Manual: manual backup</li>
         * </ul>
         * <p>Valid values for point-in-time backup:</p>
         * <ul>
         * <li>Automated: point-in-time backup after full backup</li>
         * <li>Manual: manual point-in-time backup</li>
         * <li>Period: point-in-time backup that is triggered by a backup policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <p>The size of the backup file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2167808</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The UTC time when the backup started. The time is in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-22T12:00:25Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The local time when the backup started. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-05-30 03:29:00</p>
         */
        @NameInMap("BackupStartTimeLocal")
        public String backupStartTimeLocal;

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The name of a point-in-time backup set or the full backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpgbackup_555*****_20211222200019</p>
         */
        @NameInMap("BaksetName")
        public String baksetName;

        /**
         * <ul>
         * <li>For full backup, this parameter indicates the point in time at which the data in the data backup file is consistent.</li>
         * <li>For point-in-time backup, this parameter indicates that the returned point in time is a timestamp.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1576506856</p>
         */
        @NameInMap("ConsistentTime")
        public Long consistentTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp**************-master</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The type of the backup. Valid values:</p>
         * <ul>
         * <li>DATA: full backup</li>
         * <li>RESTOREPOI: point-in-time backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA</p>
         */
        @NameInMap("DataType")
        public String dataType;

        public static DescribeDataBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupsResponseBodyItems self = new DescribeDataBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupsResponseBodyItems setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeDataBackupsResponseBodyItems setBackupEndTimeLocal(String backupEndTimeLocal) {
            this.backupEndTimeLocal = backupEndTimeLocal;
            return this;
        }
        public String getBackupEndTimeLocal() {
            return this.backupEndTimeLocal;
        }

        public DescribeDataBackupsResponseBodyItems setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeDataBackupsResponseBodyItems setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeDataBackupsResponseBodyItems setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeDataBackupsResponseBodyItems setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeDataBackupsResponseBodyItems setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeDataBackupsResponseBodyItems setBackupStartTimeLocal(String backupStartTimeLocal) {
            this.backupStartTimeLocal = backupStartTimeLocal;
            return this;
        }
        public String getBackupStartTimeLocal() {
            return this.backupStartTimeLocal;
        }

        public DescribeDataBackupsResponseBodyItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeDataBackupsResponseBodyItems setBaksetName(String baksetName) {
            this.baksetName = baksetName;
            return this;
        }
        public String getBaksetName() {
            return this.baksetName;
        }

        public DescribeDataBackupsResponseBodyItems setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeDataBackupsResponseBodyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDataBackupsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

    }

}
