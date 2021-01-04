// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Backup")
    public DescribeBackupResponseBodyBackup backup;

    public static DescribeBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupResponseBody self = new DescribeBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupResponseBody setBackup(DescribeBackupResponseBodyBackup backup) {
        this.backup = backup;
        return this;
    }
    public DescribeBackupResponseBodyBackup getBackup() {
        return this.backup;
    }

    public static class DescribeBackupResponseBodyBackup extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("Details")
        public String details;

        @NameInMap("DataCenterId")
        public String dataCenterId;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeBackupResponseBodyBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupResponseBodyBackup self = new DescribeBackupResponseBodyBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupResponseBodyBackup setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeBackupResponseBodyBackup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupResponseBodyBackup setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupResponseBodyBackup setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeBackupResponseBodyBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupResponseBodyBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupResponseBodyBackup setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

        public DescribeBackupResponseBodyBackup setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        public DescribeBackupResponseBodyBackup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
