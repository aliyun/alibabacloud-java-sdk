// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class PrecheckSkillUploadViaOssResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public java.util.List<PrecheckSkillUploadViaOssResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PrecheckSkillUploadViaOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckSkillUploadViaOssResponseBody self = new PrecheckSkillUploadViaOssResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckSkillUploadViaOssResponseBody setData(java.util.List<PrecheckSkillUploadViaOssResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PrecheckSkillUploadViaOssResponseBodyData> getData() {
        return this.data;
    }

    public PrecheckSkillUploadViaOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PrecheckSkillUploadViaOssResponseBodyData extends TeaModel {
        /**
         * <p>The draft mode: HEAD or VERSIONED, determined by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("draftMode")
        public String draftMode;

        /**
         * <p>The version currently being edited.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("editingVersion")
        public String editingVersion;

        /**
         * <p>The entry path of the Skill package.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("entryPath")
        public String entryPath;

        /**
         * <p>Indicates whether the Skill already exists.</p>
         */
        @NameInMap("exists")
        public Boolean exists;

        /**
         * <p>The content revision identifier of the persistent draft, used to determine whether the local cache has expired. Returned only in HEAD draft mode.</p>
         * 
         * <strong>example:</strong>
         * <p>rev-1a2b3c4d</p>
         */
        @NameInMap("headRevision")
        public String headRevision;

        /**
         * <p>The status of the persistent draft: draft, reviewing, or reviewed. Returned only in HEAD draft mode.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("headStatus")
        public String headStatus;

        /**
         * <p>The highest published version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("maxPublishedVersion")
        public String maxPublishedVersion;

        /**
         * <p>The resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The version parsed from the uploaded content.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("parsedVersion")
        public String parsedVersion;

        /**
         * <p>The dry run result code.</p>
         * 
         * <strong>example:</strong>
         * <p>VALIDATION_FAILED</p>
         */
        @NameInMap("precheckCode")
        public String precheckCode;

        /**
         * <p>The reason description.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource processing completed</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>The version currently under review.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("reviewingVersion")
        public String reviewingVersion;

        /**
         * <p>The Skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>The target version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static PrecheckSkillUploadViaOssResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PrecheckSkillUploadViaOssResponseBodyData self = new PrecheckSkillUploadViaOssResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PrecheckSkillUploadViaOssResponseBodyData setDraftMode(String draftMode) {
            this.draftMode = draftMode;
            return this;
        }
        public String getDraftMode() {
            return this.draftMode;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setEditingVersion(String editingVersion) {
            this.editingVersion = editingVersion;
            return this;
        }
        public String getEditingVersion() {
            return this.editingVersion;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setEntryPath(String entryPath) {
            this.entryPath = entryPath;
            return this;
        }
        public String getEntryPath() {
            return this.entryPath;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Boolean getExists() {
            return this.exists;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setHeadRevision(String headRevision) {
            this.headRevision = headRevision;
            return this;
        }
        public String getHeadRevision() {
            return this.headRevision;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setHeadStatus(String headStatus) {
            this.headStatus = headStatus;
            return this;
        }
        public String getHeadStatus() {
            return this.headStatus;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setMaxPublishedVersion(String maxPublishedVersion) {
            this.maxPublishedVersion = maxPublishedVersion;
            return this;
        }
        public String getMaxPublishedVersion() {
            return this.maxPublishedVersion;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setParsedVersion(String parsedVersion) {
            this.parsedVersion = parsedVersion;
            return this;
        }
        public String getParsedVersion() {
            return this.parsedVersion;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setPrecheckCode(String precheckCode) {
            this.precheckCode = precheckCode;
            return this;
        }
        public String getPrecheckCode() {
            return this.precheckCode;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setReviewingVersion(String reviewingVersion) {
            this.reviewingVersion = reviewingVersion;
            return this;
        }
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public PrecheckSkillUploadViaOssResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
