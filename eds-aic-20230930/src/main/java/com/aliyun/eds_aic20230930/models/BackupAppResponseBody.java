// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    @NameInMap("Data")
    public java.util.List<BackupAppResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-14xwibw7pyrjd****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static BackupAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BackupAppResponseBody self = new BackupAppResponseBody();
        return TeaModel.build(map, self);
    }

    public BackupAppResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public BackupAppResponseBody setData(java.util.List<BackupAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BackupAppResponseBodyData> getData() {
        return this.data;
    }

    public BackupAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BackupAppResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class BackupAppResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <strong>example:</strong>
         * <p>bf-b0qbg3pbpjkn7****</p>
         */
        @NameInMap("BackupFileId")
        public String backupFileId;

        /**
         * <strong>example:</strong>
         * <p>MyBackup</p>
         */
        @NameInMap("BackupFileName")
        public String backupFileName;

        /**
         * <strong>example:</strong>
         * <p>t-4ks224ujixw****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static BackupAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BackupAppResponseBodyData self = new BackupAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BackupAppResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public BackupAppResponseBodyData setBackupFileId(String backupFileId) {
            this.backupFileId = backupFileId;
            return this;
        }
        public String getBackupFileId() {
            return this.backupFileId;
        }

        public BackupAppResponseBodyData setBackupFileName(String backupFileName) {
            this.backupFileName = backupFileName;
            return this;
        }
        public String getBackupFileName() {
            return this.backupFileName;
        }

        public BackupAppResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
