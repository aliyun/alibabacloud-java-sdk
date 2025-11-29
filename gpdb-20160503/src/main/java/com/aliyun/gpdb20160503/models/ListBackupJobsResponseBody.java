// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListBackupJobsResponseBody extends TeaModel {
    /**
     * <p>The queried backup jobs.</p>
     */
    @NameInMap("Items")
    public ListBackupJobsResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBackupJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackupJobsResponseBody self = new ListBackupJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackupJobsResponseBody setItems(ListBackupJobsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListBackupJobsResponseBodyItems getItems() {
        return this.items;
    }

    public ListBackupJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBackupJobsResponseBodyItemsBackupJob extends TeaModel {
        /**
         * <p>The backup job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BackupJobId")
        public String backupJobId;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The backup status. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Failure</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The progress of the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>50%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The time when the backup job started. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-11T09:26:43Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListBackupJobsResponseBodyItemsBackupJob build(java.util.Map<String, ?> map) throws Exception {
            ListBackupJobsResponseBodyItemsBackupJob self = new ListBackupJobsResponseBodyItemsBackupJob();
            return TeaModel.build(map, self);
        }

        public ListBackupJobsResponseBodyItemsBackupJob setBackupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public String getBackupJobId() {
            return this.backupJobId;
        }

        public ListBackupJobsResponseBodyItemsBackupJob setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public ListBackupJobsResponseBodyItemsBackupJob setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public ListBackupJobsResponseBodyItemsBackupJob setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public ListBackupJobsResponseBodyItemsBackupJob setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListBackupJobsResponseBodyItems extends TeaModel {
        @NameInMap("BackupJob")
        public java.util.List<ListBackupJobsResponseBodyItemsBackupJob> backupJob;

        public static ListBackupJobsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListBackupJobsResponseBodyItems self = new ListBackupJobsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListBackupJobsResponseBodyItems setBackupJob(java.util.List<ListBackupJobsResponseBodyItemsBackupJob> backupJob) {
            this.backupJob = backupJob;
            return this;
        }
        public java.util.List<ListBackupJobsResponseBodyItemsBackupJob> getBackupJob() {
            return this.backupJob;
        }

    }

}
