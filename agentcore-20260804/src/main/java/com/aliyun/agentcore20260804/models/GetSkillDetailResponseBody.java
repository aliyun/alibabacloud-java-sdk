// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetSkillDetailResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetSkillDetailResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
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
        /**
         * <p>The version author.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("author")
        public String author;

        /**
         * <p>The commit message.</p>
         * 
         * <strong>example:</strong>
         * <p>Update documentation</p>
         */
        @NameInMap("commitMsg")
        public String commitMsg;

        /**
         * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787671022000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The download count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("downloadCount")
        public Long downloadCount;

        /**
         * <p>The publish pipeline information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:&quot;SUCCESS&quot;}</p>
         */
        @NameInMap("publishPipelineInfo")
        public String publishPipelineInfo;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787671022000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
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
        /**
         * <p>The business tag JSON array string.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample property value</p>
         */
        @NameInMap("bizTags")
        public String bizTags;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The total number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("downloadCount")
        public Long downloadCount;

        /**
         * <p>The version currently being edited.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("editingVersion")
        public String editingVersion;

        /**
         * <p>Indicates whether the Skill is enabled.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The source tag.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOAD</p>
         */
        @NameInMap("from")
        public String from;

        /**
         * <p>The label mapping.</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of online versions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("onlineCnt")
        public Integer onlineCnt;

        /**
         * <p>The resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The version currently under review.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("reviewingVersion")
        public String reviewingVersion;

        /**
         * <p>The visibility scope.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787671022000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The list of all version summaries.</p>
         */
        @NameInMap("versions")
        public java.util.List<GetSkillDetailResponseBodyDataVersions> versions;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        /**
         * <p>Indicates whether the current user has write permissions.</p>
         */
        @NameInMap("writeable")
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

        public GetSkillDetailResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
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
