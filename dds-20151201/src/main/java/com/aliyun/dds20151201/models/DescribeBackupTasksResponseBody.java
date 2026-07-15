// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    /**
     * <p>The details of the backup jobs.</p>
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
         * <p>The status of the backup job.</p>
         * <ul>
         * <li><p><strong>Scheduled</strong>: The backup job is scheduled. This includes regular backup jobs that have not started.</p>
         * </li>
         * <li><p><strong>Checking</strong>: The instance is being checked before the backup.</p>
         * </li>
         * <li><p><strong>Backuping</strong>: The backup is in progress.</p>
         * </li>
         * <li><p><strong>Finished</strong>: The backup is complete.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        @NameInMap("BackupSetStatus")
        public String backupSetStatus;

        /**
         * <p>The start time of the backup.</p>
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
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><p><strong>Automated</strong>: automatic backup.</p>
         * </li>
         * <li><p><strong>Manual</strong>: manual backup.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        /**
         * <p>The backup progress in percentage. The progress is displayed only for running backup jobs.</p>
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
