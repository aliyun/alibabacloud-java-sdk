// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeBackupsResponseBodyItems> items;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupSetInfo")
        public String backupSetInfo;

        @NameInMap("BackupSize")
        public Integer backupSize;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("DBClusterId")
        public String DBClusterId;

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

        public DescribeBackupsResponseBodyItems setBackupSetInfo(String backupSetInfo) {
            this.backupSetInfo = backupSetInfo;
            return this;
        }
        public String getBackupSetInfo() {
            return this.backupSetInfo;
        }

        public DescribeBackupsResponseBodyItems setBackupSize(Integer backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Integer getBackupSize() {
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

    }

}
