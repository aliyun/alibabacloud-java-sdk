// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataBackupsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeDataBackupsResponseBodyItems> items;

    public static DescribeDataBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupsResponseBody self = new DescribeDataBackupsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDataBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDataBackupsResponseBody setItems(java.util.List<DescribeDataBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataBackupsResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeDataBackupsResponseBodyItems extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("ConsistentTime")
        public Long consistentTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupEndTimeLocal")
        public String backupEndTimeLocal;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("BaksetName")
        public String baksetName;

        @NameInMap("BackupSize")
        public Long backupSize;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("BackupStartTimeLocal")
        public String backupStartTimeLocal;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeDataBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupsResponseBodyItems self = new DescribeDataBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataBackupsResponseBodyItems setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeDataBackupsResponseBodyItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeDataBackupsResponseBodyItems setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
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

        public DescribeDataBackupsResponseBodyItems setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeDataBackupsResponseBodyItems setBaksetName(String baksetName) {
            this.baksetName = baksetName;
            return this;
        }
        public String getBaksetName() {
            return this.baksetName;
        }

        public DescribeDataBackupsResponseBodyItems setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeDataBackupsResponseBodyItems setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeDataBackupsResponseBodyItems setBackupStartTimeLocal(String backupStartTimeLocal) {
            this.backupStartTimeLocal = backupStartTimeLocal;
            return this;
        }
        public String getBackupStartTimeLocal() {
            return this.backupStartTimeLocal;
        }

        public DescribeDataBackupsResponseBodyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
