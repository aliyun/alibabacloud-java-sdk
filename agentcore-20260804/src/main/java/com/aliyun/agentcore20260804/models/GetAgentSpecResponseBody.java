// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetAgentSpecResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAgentSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecResponseBody self = new GetAgentSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecResponseBody setData(GetAgentSpecResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentSpecResponseBodyData getData() {
        return this.data;
    }

    public GetAgentSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentSpecResponseBodyDataVersions extends TeaModel {
        /**
         * <p>The version author.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("author")
        public String author;

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
         * <p>The number of downloads.</p>
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

        public static GetAgentSpecResponseBodyDataVersions build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpecResponseBodyDataVersions self = new GetAgentSpecResponseBodyDataVersions();
            return TeaModel.build(map, self);
        }

        public GetAgentSpecResponseBodyDataVersions setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetAgentSpecResponseBodyDataVersions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAgentSpecResponseBodyDataVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentSpecResponseBodyDataVersions setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public GetAgentSpecResponseBodyDataVersions setPublishPipelineInfo(String publishPipelineInfo) {
            this.publishPipelineInfo = publishPipelineInfo;
            return this;
        }
        public String getPublishPipelineInfo() {
            return this.publishPipelineInfo;
        }

        public GetAgentSpecResponseBodyDataVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAgentSpecResponseBodyDataVersions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetAgentSpecResponseBodyDataVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAgentSpecResponseBodyData extends TeaModel {
        /**
         * <p>The business tags.</p>
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
         * <p>The number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("downloadCount")
        public Long downloadCount;

        /**
         * <p>The version that is currently being edited.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("editingVersion")
        public String editingVersion;

        /**
         * <p>Indicates whether the AgentSpec is enabled.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOAD</p>
         */
        @NameInMap("from")
        public String from;

        /**
         * <p>The version labels.</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
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
         * <p>The version that is currently under review.</p>
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
         * <p>The list of version summaries.</p>
         */
        @NameInMap("versions")
        public java.util.List<GetAgentSpecResponseBodyDataVersions> versions;

        public static GetAgentSpecResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpecResponseBodyData self = new GetAgentSpecResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentSpecResponseBodyData setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

        public GetAgentSpecResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentSpecResponseBodyData setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public GetAgentSpecResponseBodyData setEditingVersion(String editingVersion) {
            this.editingVersion = editingVersion;
            return this;
        }
        public String getEditingVersion() {
            return this.editingVersion;
        }

        public GetAgentSpecResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAgentSpecResponseBodyData setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public GetAgentSpecResponseBodyData setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public GetAgentSpecResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentSpecResponseBodyData setOnlineCnt(Integer onlineCnt) {
            this.onlineCnt = onlineCnt;
            return this;
        }
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        public GetAgentSpecResponseBodyData setReviewingVersion(String reviewingVersion) {
            this.reviewingVersion = reviewingVersion;
            return this;
        }
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        public GetAgentSpecResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetAgentSpecResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetAgentSpecResponseBodyData setVersions(java.util.List<GetAgentSpecResponseBodyDataVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetAgentSpecResponseBodyDataVersions> getVersions() {
            return this.versions;
        }

    }

}
