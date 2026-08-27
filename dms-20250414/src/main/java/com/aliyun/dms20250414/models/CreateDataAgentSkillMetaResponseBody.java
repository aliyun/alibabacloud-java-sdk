// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSkillMetaResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public CreateDataAgentSkillMetaResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when a system-level request failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.                                 </li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataAgentSkillMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentSkillMetaResponseBody self = new CreateDataAgentSkillMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentSkillMetaResponseBody setData(CreateDataAgentSkillMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAgentSkillMetaResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAgentSkillMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataAgentSkillMetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAgentSkillMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAgentSkillMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataAgentSkillMetaResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the parent account.</p>
         * 
         * <strong>example:</strong>
         * <p>16738266********</p>
         */
        @NameInMap("AliyunParentUid")
        public String aliyunParentUid;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("CreatorUserName")
        public String creatorUserName;

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a demo skill description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the skill is available. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The skill parsing error message.</p>
         * <ul>
         * <li>When the skill status is INVALID, the parsing error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md file not exist.</p>
         */
        @NameInMap("ParseError")
        public String parseError;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The skill source.</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("SkillFrom")
        public String skillFrom;

        /**
         * <p>The skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ski-04pomiln*************j0</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>data-query-skill</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The skill status. Valid values:</p>
         * <ul>
         * <li>INIT: Not ready.</li>
         * <li>ACTIVE: Active.</li>
         * <li>INVALID: Invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("SkillStatus")
        public String skillStatus;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11if52e44**********edbv6</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static CreateDataAgentSkillMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentSkillMetaResponseBodyData self = new CreateDataAgentSkillMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentSkillMetaResponseBodyData setAliyunParentUid(String aliyunParentUid) {
            this.aliyunParentUid = aliyunParentUid;
            return this;
        }
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        public CreateDataAgentSkillMetaResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public CreateDataAgentSkillMetaResponseBodyData setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public CreateDataAgentSkillMetaResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataAgentSkillMetaResponseBodyData setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public CreateDataAgentSkillMetaResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public CreateDataAgentSkillMetaResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateDataAgentSkillMetaResponseBodyData setParseError(String parseError) {
            this.parseError = parseError;
            return this;
        }
        public String getParseError() {
            return this.parseError;
        }

        public CreateDataAgentSkillMetaResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateDataAgentSkillMetaResponseBodyData setSkillFrom(String skillFrom) {
            this.skillFrom = skillFrom;
            return this;
        }
        public String getSkillFrom() {
            return this.skillFrom;
        }

        public CreateDataAgentSkillMetaResponseBodyData setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public CreateDataAgentSkillMetaResponseBodyData setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public CreateDataAgentSkillMetaResponseBodyData setSkillStatus(String skillStatus) {
            this.skillStatus = skillStatus;
            return this;
        }
        public String getSkillStatus() {
            return this.skillStatus;
        }

        public CreateDataAgentSkillMetaResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
