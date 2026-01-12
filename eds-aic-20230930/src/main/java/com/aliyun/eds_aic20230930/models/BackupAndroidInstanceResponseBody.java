// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupAndroidInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    @NameInMap("Data")
    public java.util.List<BackupAndroidInstanceResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>440D7342-5FC2-5E7C-B2DB-D0B4EAC2BDF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-14xwibw7pyrjd****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static BackupAndroidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BackupAndroidInstanceResponseBody self = new BackupAndroidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public BackupAndroidInstanceResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public BackupAndroidInstanceResponseBody setData(java.util.List<BackupAndroidInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BackupAndroidInstanceResponseBodyData> getData() {
        return this.data;
    }

    public BackupAndroidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BackupAndroidInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class BackupAndroidInstanceResponseBodyData extends TeaModel {
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
         * <p>a-58ftsoo90p0qa****.ab</p>
         */
        @NameInMap("BackupFileName")
        public String backupFileName;

        /**
         * <strong>example:</strong>
         * <p>t-bp67acfmxazb4p****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static BackupAndroidInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BackupAndroidInstanceResponseBodyData self = new BackupAndroidInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BackupAndroidInstanceResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public BackupAndroidInstanceResponseBodyData setBackupFileId(String backupFileId) {
            this.backupFileId = backupFileId;
            return this;
        }
        public String getBackupFileId() {
            return this.backupFileId;
        }

        public BackupAndroidInstanceResponseBodyData setBackupFileName(String backupFileName) {
            this.backupFileName = backupFileName;
            return this;
        }
        public String getBackupFileName() {
            return this.backupFileName;
        }

        public BackupAndroidInstanceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
