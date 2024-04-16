// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreatePublishResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreatePublishResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishResponseBody self = new CreatePublishResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePublishResponseBody setData(CreatePublishResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePublishResponseBodyData getData() {
        return this.data;
    }

    public CreatePublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePublishResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PublishId")
        public String publishId;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SubTasks")
        public java.util.List<java.util.Map<String, String>> subTasks;

        @NameInMap("VersionNumber")
        public String versionNumber;

        public static CreatePublishResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePublishResponseBodyData self = new CreatePublishResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePublishResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreatePublishResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreatePublishResponseBodyData setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public CreatePublishResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreatePublishResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePublishResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public CreatePublishResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreatePublishResponseBodyData setPublishId(String publishId) {
            this.publishId = publishId;
            return this;
        }
        public String getPublishId() {
            return this.publishId;
        }

        public CreatePublishResponseBodyData setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public CreatePublishResponseBodyData setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public CreatePublishResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreatePublishResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreatePublishResponseBodyData setSubTasks(java.util.List<java.util.Map<String, String>> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSubTasks() {
            return this.subTasks;
        }

        public CreatePublishResponseBodyData setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

    }

}
