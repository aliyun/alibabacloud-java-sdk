// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    /**
     * <p>The details of the backup task.</p>
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
         * <p>The backup task status. Valid values:</p>
         * <ul>
         * <li><strong>Scheduled</strong>: The backup task is in planning. Regular backup tasks that have not started are also in this state.</li>
         * <li><strong>Checking</strong>: The instance is being checked before the backup.</li>
         * <li><strong>Backuping</strong>: The backup task is in progress.</li>
         * <li><strong>Finished</strong>: The backup task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        @NameInMap("BackupSetStatus")
        public String backupSetStatus;

        /**
         * <p>The start time of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-16T11:04:56Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The ID of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>170034</p>
         */
        @NameInMap("BackupjobId")
        public String backupjobId;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong>: automatic backup</li>
         * <li><strong>Manual</strong>: manual backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        /**
         * <p>The progress of the backup task. Unit: %. The progress is returned only for running backup tasks.</p>
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
