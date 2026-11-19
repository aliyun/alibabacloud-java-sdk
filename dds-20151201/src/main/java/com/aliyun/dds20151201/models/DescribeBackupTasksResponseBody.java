// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    /**
     * <p>The backup job details.</p>
     */
    @NameInMap("BackupJobs")
    public java.util.List<DescribeBackupTasksResponseBodyBackupJobs> backupJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D648B367-15B6-1B42-BD4B-47507C9CC****</p>
     */
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
        /**
         * <p>The backup job status. Valid values:</p>
         * <ul>
         * <li><strong>Scheduled</strong>: The backup task is scheduled, including routine backup tasks that have not started.</li>
         * <li><strong>Checking</strong>: The instance is being checked before the backup.</li>
         * <li><strong>Backuping</strong>: The backup is in progress.</li>
         * <li><strong>Finished</strong>: The backup is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        @NameInMap("BackupSetStatus")
        public String backupSetStatus;

        /**
         * <p>The backup start time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-16T11:04:56Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The backup job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>170034</p>
         */
        @NameInMap("BackupjobId")
        public String backupjobId;

        /**
         * <p>The backup pattern. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong>: Automatic backup.</li>
         * <li><strong>Manual</strong>: Manual backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        /**
         * <p>The backup progress in percentage. The progress is displayed only for running backups.</p>
         * 
         * <strong>example:</strong>
         * <p>18%</p>
         */
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

        public DescribeBackupTasksResponseBodyBackupJobs setBackupjobId(String backupjobId) {
            this.backupjobId = backupjobId;
            return this;
        }
        public String getBackupjobId() {
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
