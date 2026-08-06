// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetPromptResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetPromptResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPromptResponseBody self = new GetPromptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPromptResponseBody setData(GetPromptResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPromptResponseBodyData getData() {
        return this.data;
    }

    public GetPromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPromptResponseBodyDataVersionDetails extends TeaModel {
        /**
         * <p>The commit message of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test Version</p>
         */
        @NameInMap("CommitMsg")
        public String commitMsg;

        /**
         * <p>The time when the version was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1627545952000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The unique identifier of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-qa</p>
         */
        @NameInMap("PromptKey")
        public String promptKey;

        /**
         * <p>The creator of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("SrcUser")
        public String srcUser;

        /**
         * <p>The version status. Valid values: draft and online.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetPromptResponseBodyDataVersionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPromptResponseBodyDataVersionDetails self = new GetPromptResponseBodyDataVersionDetails();
            return TeaModel.build(map, self);
        }

        public GetPromptResponseBodyDataVersionDetails setCommitMsg(String commitMsg) {
            this.commitMsg = commitMsg;
            return this;
        }
        public String getCommitMsg() {
            return this.commitMsg;
        }

        public GetPromptResponseBodyDataVersionDetails setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetPromptResponseBodyDataVersionDetails setPromptKey(String promptKey) {
            this.promptKey = promptKey;
            return this;
        }
        public String getPromptKey() {
            return this.promptKey;
        }

        public GetPromptResponseBodyDataVersionDetails setSrcUser(String srcUser) {
            this.srcUser = srcUser;
            return this;
        }
        public String getSrcUser() {
            return this.srcUser;
        }

        public GetPromptResponseBodyDataVersionDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPromptResponseBodyDataVersionDetails setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetPromptResponseBodyData extends TeaModel {
        /**
         * <p>The list of business tags.</p>
         */
        @NameInMap("BizTags")
        public java.util.List<String> bizTags;

        /**
         * <p>The description of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Prompt for test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The version number of the draft version. This value is empty if no draft version exists.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("EditingVersion")
        public String editingVersion;

        /**
         * <p>The time when the prompt was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-13T02:11:53Z</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The mapping between prompt labels and versions.</p>
         */
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The version number of the latest version of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The number of online versions of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineCnt")
        public Integer onlineCnt;

        /**
         * <p>The unique identifier of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-qa</p>
         */
        @NameInMap("PromptKey")
        public String promptKey;

        /**
         * <p>The version number of the prompt version that is under review.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("ReviewingVersion")
        public String reviewingVersion;

        /**
         * <p>The schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("SchemaVersion")
        public Integer schemaVersion;

        /**
         * <p>The list of version details.</p>
         */
        @NameInMap("VersionDetails")
        public java.util.List<GetPromptResponseBodyDataVersionDetails> versionDetails;

        /**
         * <p>The list of version numbers.</p>
         */
        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static GetPromptResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPromptResponseBodyData self = new GetPromptResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPromptResponseBodyData setBizTags(java.util.List<String> bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public java.util.List<String> getBizTags() {
            return this.bizTags;
        }

        public GetPromptResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPromptResponseBodyData setEditingVersion(String editingVersion) {
            this.editingVersion = editingVersion;
            return this;
        }
        public String getEditingVersion() {
            return this.editingVersion;
        }

        public GetPromptResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetPromptResponseBodyData setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public GetPromptResponseBodyData setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetPromptResponseBodyData setOnlineCnt(Integer onlineCnt) {
            this.onlineCnt = onlineCnt;
            return this;
        }
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        public GetPromptResponseBodyData setPromptKey(String promptKey) {
            this.promptKey = promptKey;
            return this;
        }
        public String getPromptKey() {
            return this.promptKey;
        }

        public GetPromptResponseBodyData setReviewingVersion(String reviewingVersion) {
            this.reviewingVersion = reviewingVersion;
            return this;
        }
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        public GetPromptResponseBodyData setSchemaVersion(Integer schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetPromptResponseBodyData setVersionDetails(java.util.List<GetPromptResponseBodyDataVersionDetails> versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }
        public java.util.List<GetPromptResponseBodyDataVersionDetails> getVersionDetails() {
            return this.versionDetails;
        }

        public GetPromptResponseBodyData setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

}
