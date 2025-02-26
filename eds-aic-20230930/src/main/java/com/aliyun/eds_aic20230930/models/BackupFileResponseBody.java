// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupFileResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The objects that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("Data")
    public java.util.List<BackupFileResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The batch task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-22ex666a5mco5****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static BackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BackupFileResponseBody self = new BackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public BackupFileResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public BackupFileResponseBody setData(java.util.List<BackupFileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BackupFileResponseBodyData> getData() {
        return this.data;
    }

    public BackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BackupFileResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class BackupFileResponseBodyData extends TeaModel {
        /**
         * <p>Instance id.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>Backup file id.</p>
         * 
         * <strong>example:</strong>
         * <p>bf-b0qbg3pbpjkn7****</p>
         */
        @NameInMap("BackupFileId")
        public String backupFileId;

        /**
         * <p>Backup file name.</p>
         * 
         * <strong>example:</strong>
         * <p>a-58ftsoo90p0qa****.ab</p>
         */
        @NameInMap("BackupFileName")
        public String backupFileName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-22ex666a5mco5****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static BackupFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BackupFileResponseBodyData self = new BackupFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BackupFileResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public BackupFileResponseBodyData setBackupFileId(String backupFileId) {
            this.backupFileId = backupFileId;
            return this;
        }
        public String getBackupFileId() {
            return this.backupFileId;
        }

        public BackupFileResponseBodyData setBackupFileName(String backupFileName) {
            this.backupFileName = backupFileName;
            return this;
        }
        public String getBackupFileName() {
            return this.backupFileName;
        }

        public BackupFileResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
