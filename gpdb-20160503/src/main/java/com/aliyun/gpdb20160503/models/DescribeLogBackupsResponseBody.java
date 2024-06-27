// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeLogBackupsResponseBody extends TeaModel {
    /**
     * <p>Details of the backup sets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeLogBackupsResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
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
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>24B9FCAF-2CBC-51C3-B563-F1C70D750187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total size of logs in the time range. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>386748</p>
     */
    @NameInMap("TotalLogSize")
    public Long totalLogSize;

    public static DescribeLogBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupsResponseBody self = new DescribeLogBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupsResponseBody setItems(java.util.List<DescribeLogBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeLogBackupsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeLogBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public DescribeLogBackupsResponseBody setTotalLogSize(Long totalLogSize) {
        this.totalLogSize = totalLogSize;
        return this;
    }
    public Long getTotalLogSize() {
        return this.totalLogSize;
    }

    public static class DescribeLogBackupsResponseBodyItems extends TeaModel {
        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>12413721782</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The ID of the coordinator node.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****-master</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The name of the log backup set that is stored in Object Storage Service (OSS).</p>
         * 
         * <strong>example:</strong>
         * <p>000000010000000400000012</p>
         */
        @NameInMap("LogFileName")
        public String logFileName;

        /**
         * <p>The size of the log backup set. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>77350</p>
         */
        @NameInMap("LogFileSize")
        public Long logFileSize;

        /**
         * <p>The timestamp of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-12T02:14:26Z</p>
         */
        @NameInMap("LogTime")
        public String logTime;

        /**
         * <p>The name of the compute node.</p>
         * 
         * <strong>example:</strong>
         * <p>segment-0</p>
         */
        @NameInMap("SegmentName")
        public String segmentName;

        public static DescribeLogBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupsResponseBodyItems self = new DescribeLogBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupsResponseBodyItems setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeLogBackupsResponseBodyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeLogBackupsResponseBodyItems setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
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

    }

}
