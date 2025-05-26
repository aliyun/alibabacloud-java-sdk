// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("FreeBackupSize")
    public Long freeBackupSize;

    /**
     * <p>The queried backup sets.</p>
     */
    @NameInMap("Items")
    public DescribeBackupsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE17270B-F8F8-5A31-9DB4-DADDFDAD7940</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalBackupSize")
    public Long totalBackupSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setFreeBackupSize(Long freeBackupSize) {
        this.freeBackupSize = freeBackupSize;
        return this;
    }
    public Long getFreeBackupSize() {
        return this.freeBackupSize;
    }

    public DescribeBackupsResponseBody setItems(DescribeBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponseBody setTotalBackupSize(Long totalBackupSize) {
        this.totalBackupSize = totalBackupSize;
        return this;
    }
    public Long getTotalBackupSize() {
        return this.totalBackupSize;
    }

    public DescribeBackupsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupsResponseBodyItemsBackup extends TeaModel {
        /**
         * <p>The end time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-02T16:00Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupExpiredTime")
        public String backupExpiredTime;

        /**
         * <p>The backup set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32732****</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup method. Snapshot is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupRegion")
        public String backupRegion;

        /**
         * <p>The size of the backup set. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2167808</p>
         */
        @NameInMap("BackupSize")
        public Integer backupSize;

        /**
         * <p>The start time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-01T16:00Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>FullBackup</strong></li>
         * <li><strong>IncrementalBackup</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp11q28kvl688****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("ParentBackupId")
        public String parentBackupId;

        public static DescribeBackupsResponseBodyItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItemsBackup self = new DescribeBackupsResponseBodyItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupExpiredTime(String backupExpiredTime) {
            this.backupExpiredTime = backupExpiredTime;
            return this;
        }
        public String getBackupExpiredTime() {
            return this.backupExpiredTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupRegion(String backupRegion) {
            this.backupRegion = backupRegion;
            return this;
        }
        public String getBackupRegion() {
            return this.backupRegion;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupSize(Integer backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Integer getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyItemsBackup setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeBackupsResponseBodyItemsBackup setParentBackupId(String parentBackupId) {
            this.parentBackupId = parentBackupId;
            return this;
        }
        public String getParentBackupId() {
            return this.parentBackupId;
        }

    }

    public static class DescribeBackupsResponseBodyItems extends TeaModel {
        @NameInMap("Backup")
        public java.util.List<DescribeBackupsResponseBodyItemsBackup> backup;

        public static DescribeBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItems self = new DescribeBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItems setBackup(java.util.List<DescribeBackupsResponseBodyItemsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyItemsBackup> getBackup() {
            return this.backup;
        }

    }

}
