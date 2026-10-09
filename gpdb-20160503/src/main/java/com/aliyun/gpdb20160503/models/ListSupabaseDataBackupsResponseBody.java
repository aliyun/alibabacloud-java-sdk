// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseDataBackupsResponseBody extends TeaModel {
    /**
     * <p>The list of backup sets.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListSupabaseDataBackupsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. You can use this value as the NextToken parameter in the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of backup sets on the current page.</p>
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
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total size of the backup sets. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("TotalBackupSize")
    public Long totalBackupSize;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSupabaseDataBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseDataBackupsResponseBody self = new ListSupabaseDataBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupabaseDataBackupsResponseBody setItems(java.util.List<ListSupabaseDataBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSupabaseDataBackupsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSupabaseDataBackupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupabaseDataBackupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupabaseDataBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSupabaseDataBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSupabaseDataBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupabaseDataBackupsResponseBody setTotalBackupSize(Long totalBackupSize) {
        this.totalBackupSize = totalBackupSize;
        return this;
    }
    public Long getTotalBackupSize() {
        return this.totalBackupSize;
    }

    public ListSupabaseDataBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSupabaseDataBackupsResponseBodyItems extends TeaModel {
        /**
         * <p>The end time of the backup. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-09T01:24:44Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The local time representation of the backup end time. Format: yyyy-MM-ddTHH:mm:ssZ. The current return value is in Beijing time (UTC+8). The trailing Z is a fixed character in the compatibility format and does not indicate the zero time zone. To parse the time in a standard format, use BackupEndTime.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-09T09:24:44Z</p>
         */
        @NameInMap("BackupEndTimeLocal")
        public String backupEndTimeLocal;

        /**
         * <p>The backup method. Valid values: Physical: physical backup; Snapshot: snapshot backup.</p>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode.</p>
         * <p>Valid values for automatic backups:</p>
         * <ul>
         * <li><strong>Automated</strong>: automatic system backup.</li>
         * <li><strong>Manual</strong>: manual backup.</li>
         * </ul>
         * <p>Valid values for restorable points:</p>
         * <ul>
         * <li><strong>Automated</strong>: the restorable point after a automatic backup.</li>
         * <li><strong>Manual</strong>: the restorable point manually triggered by the user.</li>
         * <li><strong>Period</strong>: the restorable point triggered periodically based on the backup policy.</li>
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
         * <p>10737418240</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The start time of the backup. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-09T01:23:02Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The local time representation of the backup start time. Format: yyyy-MM-ddTHH:mm:ssZ. The current return value is in Beijing time (UTC+8). The trailing Z is a fixed character in the compatibility format and does not indicate the zero time zone. To parse the time in a standard format, use BackupStartTime.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-09T09:23:02Z</p>
         */
        @NameInMap("BackupStartTimeLocal")
        public String backupStartTimeLocal;

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: successful.</li>
         * <li><strong>Failure</strong>: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The name of the restorable point or the full backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>logic_backup</p>
         */
        @NameInMap("BaksetName")
        public String baksetName;

        /**
         * <p>The consistency point in time. The value is a UNIX timestamp in seconds. For a full backup, this parameter indicates the consistency point in time of the backup. For a restorable point, this parameter indicates the point in time to which data can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>1791508983</p>
         */
        @NameInMap("ConsistentTime")
        public Long consistentTime;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>DATA</strong>: full backup.</li>
         * <li><strong>RESTOREPOI</strong>: restorable point.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA</p>
         */
        @NameInMap("DataType")
        public String dataType;

        public static ListSupabaseDataBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSupabaseDataBackupsResponseBodyItems self = new ListSupabaseDataBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupEndTimeLocal(String backupEndTimeLocal) {
            this.backupEndTimeLocal = backupEndTimeLocal;
            return this;
        }
        public String getBackupEndTimeLocal() {
            return this.backupEndTimeLocal;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupStartTimeLocal(String backupStartTimeLocal) {
            this.backupStartTimeLocal = backupStartTimeLocal;
            return this;
        }
        public String getBackupStartTimeLocal() {
            return this.backupStartTimeLocal;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public ListSupabaseDataBackupsResponseBodyItems setBaksetName(String baksetName) {
            this.baksetName = baksetName;
            return this;
        }
        public String getBaksetName() {
            return this.baksetName;
        }

        public ListSupabaseDataBackupsResponseBodyItems setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public ListSupabaseDataBackupsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

    }

}
