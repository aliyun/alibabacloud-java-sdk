// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeLogBackupsResponseBody extends TeaModel {
    @NameInMap("TotalLogSize")
    public Long totalLogSize;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeLogBackupsResponseBodyItems> items;

    public static DescribeLogBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupsResponseBody self = new DescribeLogBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupsResponseBody setTotalLogSize(Long totalLogSize) {
        this.totalLogSize = totalLogSize;
        return this;
    }
    public Long getTotalLogSize() {
        return this.totalLogSize;
    }

    public DescribeLogBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLogBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLogBackupsResponseBody setItems(java.util.List<DescribeLogBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeLogBackupsResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeLogBackupsResponseBodyItems extends TeaModel {
        @NameInMap("LogFileSize")
        public Long logFileSize;

        @NameInMap("LogTime")
        public String logTime;

        @NameInMap("SegmentName")
        public String segmentName;

        @NameInMap("LogFileName")
        public String logFileName;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("BackupId")
        public String backupId;

        public static DescribeLogBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupsResponseBodyItems self = new DescribeLogBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupsResponseBodyItems setLogFileSize(Long logFileSize) {
            this.logFileSize = logFileSize;
            return this;
        }
        public Long getLogFileSize() {
            return this.logFileSize;
        }

        public DescribeLogBackupsResponseBodyItems setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public DescribeLogBackupsResponseBodyItems setSegmentName(String segmentName) {
            this.segmentName = segmentName;
            return this;
        }
        public String getSegmentName() {
            return this.segmentName;
        }

        public DescribeLogBackupsResponseBodyItems setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
        }

        public DescribeLogBackupsResponseBodyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeLogBackupsResponseBodyItems setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

    }

}
