// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataBackupsResponseBody extends TeaModel {
    /**
     * <p>Details about the backup sets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataBackupsResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of backup sets on the page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The local time when the backup ended. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.</p>
         */
        @NameInMap("BackupEndTimeLocal")
        public String backupEndTimeLocal;

        /**
         * <p>The backup mode.</p>
         * <br>
         * <p>Valid values for full backup:</p>
         * <br>
         * <p>*   Automated: automatic backup</p>
         * <p>*   Manual: manual backup</p>
         * <br>
         * <p>Valid values for point-in-time backup:</p>
         * <br>
         * <p>*   Automated: point-in-time backup after full backup</p>
         * <p>*   Manual: manual point-in-time backup</p>
         * <p>*   Period: point-in-time backup that is triggered by a backup policy</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The ID of the backup set.</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <p>The size of the backup file. Unit: bytes.</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The UTC time when the backup started. The time is in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The local time when the backup started. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.</p>
         */
        @NameInMap("BackupStartTimeLocal")
        public String backupStartTimeLocal;

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <br>
         * <p>*   Success</p>
         * <p>*   Failure</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The name of a point-in-time backup set or the full backup set.</p>
         */
        @NameInMap("BaksetName")
        public String baksetName;

        /**
         * <p>*   For full backup, this parameter indicates the point in time at which the data in the data backup file is consistent.</p>
         * <p>*   For point-in-time backup, this parameter indicates that the returned point in time is a timestamp.</p>
         */
        @NameInMap("ConsistentTime")
        public Long consistentTime;

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
