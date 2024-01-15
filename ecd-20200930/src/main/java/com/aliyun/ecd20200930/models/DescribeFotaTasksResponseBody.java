// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaTasksResponseBody extends TeaModel {
    /**
     * <p>The operation result. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Details about the image update task.</p>
     */
    @NameInMap("FotaTasks")
    public java.util.List<DescribeFotaTasksResponseBodyFotaTasks> fotaTasks;

    /**
     * <p>The returned error message. This parameter is not returned if the value of Code is `success`.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFotaTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaTasksResponseBody self = new DescribeFotaTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFotaTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFotaTasksResponseBody setFotaTasks(java.util.List<DescribeFotaTasksResponseBodyFotaTasks> fotaTasks) {
        this.fotaTasks = fotaTasks;
        return this;
    }
    public java.util.List<DescribeFotaTasksResponseBodyFotaTasks> getFotaTasks() {
        return this.fotaTasks;
    }

    public DescribeFotaTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFotaTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFotaTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFotaTasksResponseBodyFotaTasks extends TeaModel {
        /**
         * <p>The version of the image. You can call the [DescribeImages](~~188895~~) operation to obtain this parameter.</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>This parameter is not available.</p>
         */
        @NameInMap("FotaProject")
        public String fotaProject;

        /**
         * <p>The number of custom images that can be updated to this version.</p>
         */
        @NameInMap("PendingCustomImageCount")
        public Integer pendingCustomImageCount;

        /**
         * <p>The number of cloud desktops for which images can be updated to this version.</p>
         */
        @NameInMap("PendingDesktopCount")
        public Integer pendingDesktopCount;

        /**
         * <p>The time when the image version is available for update was published.</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The description of the image version that is available for update.</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The size of the image update package. Unit: KB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>Indicates whether an end user can update the image.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   valid</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The end user can update the image.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   invalid</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The end user cannot update the image.</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the image update task.</p>
         */
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
