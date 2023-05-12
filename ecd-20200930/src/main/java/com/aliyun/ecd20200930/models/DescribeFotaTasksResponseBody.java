// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaTasksResponseBody extends TeaModel {
    @NameInMap("FotaTasks")
    public java.util.List<DescribeFotaTasksResponseBodyFotaTasks> fotaTasks;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFotaTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaTasksResponseBody self = new DescribeFotaTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFotaTasksResponseBody setFotaTasks(java.util.List<DescribeFotaTasksResponseBodyFotaTasks> fotaTasks) {
        this.fotaTasks = fotaTasks;
        return this;
    }
    public java.util.List<DescribeFotaTasksResponseBodyFotaTasks> getFotaTasks() {
        return this.fotaTasks;
    }

    public DescribeFotaTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFotaTasksResponseBodyFotaTasks extends TeaModel {
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("FotaProject")
        public String fotaProject;

        @NameInMap("PendingCustomImageCount")
        public Integer pendingCustomImageCount;

        @NameInMap("PendingDesktopCount")
        public Integer pendingDesktopCount;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskUid")
        public String taskUid;

        public static DescribeFotaTasksResponseBodyFotaTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeFotaTasksResponseBodyFotaTasks self = new DescribeFotaTasksResponseBodyFotaTasks();
            return TeaModel.build(map, self);
        }

        public DescribeFotaTasksResponseBodyFotaTasks setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setFotaProject(String fotaProject) {
            this.fotaProject = fotaProject;
            return this;
        }
        public String getFotaProject() {
            return this.fotaProject;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setPendingCustomImageCount(Integer pendingCustomImageCount) {
            this.pendingCustomImageCount = pendingCustomImageCount;
            return this;
        }
        public Integer getPendingCustomImageCount() {
            return this.pendingCustomImageCount;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setPendingDesktopCount(Integer pendingDesktopCount) {
            this.pendingDesktopCount = pendingDesktopCount;
            return this;
        }
        public Integer getPendingDesktopCount() {
            return this.pendingDesktopCount;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFotaTasksResponseBodyFotaTasks setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

    }

}
