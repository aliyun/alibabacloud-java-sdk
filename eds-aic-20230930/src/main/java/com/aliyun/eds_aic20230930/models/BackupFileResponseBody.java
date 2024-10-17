// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupFileResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("Data")
    public java.util.List<BackupFileResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static class BackupFileResponseBodyData extends TeaModel {
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        @NameInMap("BackupFileId")
        public String backupFileId;

        @NameInMap("BackupFileName")
        public String backupFileName;

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
