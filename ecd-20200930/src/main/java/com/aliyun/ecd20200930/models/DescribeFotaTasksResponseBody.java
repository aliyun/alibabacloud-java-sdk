// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaTasksResponseBody extends TeaModel {
    /**
     * <p>The returned message. If the request was successful, a <code>success</code> is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Details about the image update task.</p>
     */
    @NameInMap("FotaTasks")
    public java.util.List<DescribeFotaTasksResponseBodyFotaTasks> fotaTasks;

    /**
     * <p>The returned error message. This parameter is not returned if the Code value is a <code>success</code> message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
         * <p>The image version. You can call the <a href="https://help.aliyun.com/document_detail/188895.html">DescribeImages</a> operation to obtain the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1-D-20220513.143129</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>To be hidden.</p>
         */
        @NameInMap("FotaProject")
        public String fotaProject;

        /**
         * <p>The number of custom images that can be updated to this version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PendingCustomImageCount")
        public Integer pendingCustomImageCount;

        /**
         * <p>The number of cloud computers whose images can be updated to this version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PendingDesktopCount")
        public Integer pendingDesktopCount;

        /**
         * <p>The time when the image version available for update was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-31T04:28:48Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The description of the image version available for update.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The size of the update package. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>568533470</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>Indicates whether the image update task is automatically pushed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Running: automatically pushes the image update task.</li>
         * <li>Pending: does not automatically push the image update task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the image upgrade task.</p>
         * 
         * <strong>example:</strong>
         * <p>aot-c4khwrp9ocml4****</p>
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
