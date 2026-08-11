// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    /**
     * <p>The list of backup sets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeBackupsResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
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
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setItems(java.util.List<DescribeBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeBackupsResponseBodyItems> getItems() {
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

    public DescribeBackupsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupsResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the backup ended.
         * Format: yyyy-MM-ddTHH:mmZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-22T18:28:41Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>117403****</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup method. The value is <strong>Physical</strong>, which indicates physical backup.</p>
         * 
         * <strong>example:</strong>
         * <p>Physical</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup type. Valid values: manual (manual backup) and scheduled (automatic backup).</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("BackupScheduleType")
        public String backupScheduleType;

        /**
         * <p>The number of nodes in the cluster.</p>
         * <ul>
         * <li>Single-replica edition: valid values: 1 to 48.</li>
         * <li>Master-replica cluster: valid values: 1 to 24.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;shard_count&quot;: 4}</p>
         */
        @NameInMap("BackupSetInfo")
        public String backupSetInfo;

        /**
         * <p>The backup size.
         * Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The time when the backup started. Format: yyyy-MM-ddTHH:mmZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-22T18:28:22Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The backup status. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The backup is complete.</li>
         * <li><strong>Failure</strong>: The backup failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>FullBackup</strong>: full backup.</li>
         * <li><strong>IncrementalBackup</strong>: incremental backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IncrementalBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1qx68m06981****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The expiration time of the backup set.
         * Format: yyyy-MM-ddTHH:mmZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-22T18:28:41Z</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        public static DescribeBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItems self = new DescribeBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItems setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseBodyItems setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseBodyItems setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupsResponseBodyItems setBackupScheduleType(String backupScheduleType) {
            this.backupScheduleType = backupScheduleType;
            return this;
        }
        public String getBackupScheduleType() {
            return this.backupScheduleType;
        }

        public DescribeBackupsResponseBodyItems setBackupSetInfo(String backupSetInfo) {
            this.backupSetInfo = backupSetInfo;
            return this;
        }
        public String getBackupSetInfo() {
            return this.backupSetInfo;
        }

        public DescribeBackupsResponseBodyItems setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupsResponseBodyItems setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupsResponseBodyItems setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeBackupsResponseBodyItems setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

    }

}
