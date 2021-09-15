// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetPublishResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetPublishResponseBodyData data;

    public static GetPublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublishResponseBody self = new GetPublishResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublishResponseBody setData(GetPublishResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPublishResponseBodyData getData() {
        return this.data;
    }

    public static class GetPublishResponseBodyData extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("VersionNumber")
        public String versionNumber;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PublishId")
        public String publishId;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("SubTasks")
        public java.util.List<java.util.Map<String, ?>> subTasks;

        public static GetPublishResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPublishResponseBodyData self = new GetPublishResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPublishResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetPublishResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPublishResponseBodyData setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public GetPublishResponseBodyData setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public GetPublishResponseBodyData setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

        public GetPublishResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPublishResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetPublishResponseBodyData setPublishId(String publishId) {
            this.publishId = publishId;
            return this;
        }
        public String getPublishId() {
            return this.publishId;
        }

        public GetPublishResponseBodyData setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public GetPublishResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPublishResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetPublishResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public GetPublishResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetPublishResponseBodyData setSubTasks(java.util.List<java.util.Map<String, ?>> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSubTasks() {
            return this.subTasks;
        }

    }

}
