// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetSkillDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSkillDetailResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSkillDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillDetailResponseBody self = new GetSkillDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillDetailResponseBody setData(GetSkillDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSkillDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSkillDetailResponseBodyDataVersions extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("CommitMsg")
        public String commitMsg;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DownloadCount")
        public Long downloadCount;

        @NameInMap("PublishPipelineInfo")
        public String publishPipelineInfo;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Version")
        public String version;

        public static GetSkillDetailResponseBodyDataVersions build(java.util.Map<String, ?> map) throws Exception {
            GetSkillDetailResponseBodyDataVersions self = new GetSkillDetailResponseBodyDataVersions();
            return TeaModel.build(map, self);
        }

        public GetSkillDetailResponseBodyDataVersions setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetSkillDetailResponseBodyDataVersions setCommitMsg(String commitMsg) {
            this.commitMsg = commitMsg;
            return this;
        }
        public String getCommitMsg() {
            return this.commitMsg;
        }

        public GetSkillDetailResponseBodyDataVersions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetSkillDetailResponseBodyDataVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSkillDetailResponseBodyDataVersions setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public GetSkillDetailResponseBodyDataVersions setPublishPipelineInfo(String publishPipelineInfo) {
            this.publishPipelineInfo = publishPipelineInfo;
            return this;
        }
        public String getPublishPipelineInfo() {
            return this.publishPipelineInfo;
        }

        public GetSkillDetailResponseBodyDataVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSkillDetailResponseBodyDataVersions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetSkillDetailResponseBodyDataVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetSkillDetailResponseBodyData extends TeaModel {
        @NameInMap("BizTags")
        public String bizTags;

        @NameInMap("Description")
        public String description;

        @NameInMap("DownloadCount")
        public Long downloadCount;

        @NameInMap("EditingVersion")
        public String editingVersion;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("From")
        public String from;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("OnlineCnt")
        public Integer onlineCnt;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ReviewingVersion")
        public String reviewingVersion;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Versions")
        public java.util.List<GetSkillDetailResponseBodyDataVersions> versions;

        @NameInMap("Writeable")
        public Boolean writeable;

        public static GetSkillDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillDetailResponseBodyData self = new GetSkillDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillDetailResponseBodyData setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

        public GetSkillDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSkillDetailResponseBodyData setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public GetSkillDetailResponseBodyData setEditingVersion(String editingVersion) {
            this.editingVersion = editingVersion;
            return this;
        }
        public String getEditingVersion() {
            return this.editingVersion;
        }

        public GetSkillDetailResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetSkillDetailResponseBodyData setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public GetSkillDetailResponseBodyData setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public GetSkillDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSkillDetailResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetSkillDetailResponseBodyData setOnlineCnt(Integer onlineCnt) {
            this.onlineCnt = onlineCnt;
            return this;
        }
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        public GetSkillDetailResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetSkillDetailResponseBodyData setReviewingVersion(String reviewingVersion) {
            this.reviewingVersion = reviewingVersion;
            return this;
        }
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        public GetSkillDetailResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSkillDetailResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetSkillDetailResponseBodyData setVersions(java.util.List<GetSkillDetailResponseBodyDataVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetSkillDetailResponseBodyDataVersions> getVersions() {
            return this.versions;
        }

        public GetSkillDetailResponseBodyData setWriteable(Boolean writeable) {
            this.writeable = writeable;
            return this;
        }
        public Boolean getWriteable() {
            return this.writeable;
        }

    }

}
