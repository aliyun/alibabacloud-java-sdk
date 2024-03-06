// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    @NameInMap("BackupJobs")
    public java.util.List<DescribeBackupTasksResponseBodyBackupJobs> backupJobs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponseBody self = new DescribeBackupTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponseBody setBackupJobs(java.util.List<DescribeBackupTasksResponseBodyBackupJobs> backupJobs) {
        this.backupJobs = backupJobs;
        return this;
    }
    public java.util.List<DescribeBackupTasksResponseBodyBackupJobs> getBackupJobs() {
        return this.backupJobs;
    }

    public DescribeBackupTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupTasksResponseBodyBackupJobs extends TeaModel {
        @NameInMap("BackupSetStatus")
        public String backupSetStatus;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupjobId")
        public Long backupjobId;

        @NameInMap("JobMode")
        public String jobMode;

        @NameInMap("Progress")
        public String progress;

        public static DescribeBackupTasksResponseBodyBackupJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyBackupJobs self = new DescribeBackupTasksResponseBodyBackupJobs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyBackupJobs setBackupSetStatus(String backupSetStatus) {
            this.backupSetStatus = backupSetStatus;
            return this;
        }
        public String getBackupSetStatus() {
            return this.backupSetStatus;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setBackupjobId(Long backupjobId) {
            this.backupjobId = backupjobId;
            return this;
        }
        public Long getBackupjobId() {
            return this.backupjobId;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setJobMode(String jobMode) {
            this.jobMode = jobMode;
            return this;
        }
        public String getJobMode() {
            return this.jobMode;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
