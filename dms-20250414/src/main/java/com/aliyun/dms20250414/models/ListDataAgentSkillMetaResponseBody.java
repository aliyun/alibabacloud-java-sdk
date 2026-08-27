// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentSkillMetaResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public ListDataAgentSkillMetaResponseBodyData data;

    /**
     * <p>The error code returned when the request is abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
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

    public static ListDataAgentSkillMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentSkillMetaResponseBody self = new ListDataAgentSkillMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentSkillMetaResponseBody setData(ListDataAgentSkillMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataAgentSkillMetaResponseBodyData getData() {
        return this.data;
    }

    public ListDataAgentSkillMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentSkillMetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentSkillMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentSkillMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataAgentSkillMetaResponseBodyDataContent extends TeaModel {
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
         * <p>The name of the creator.</p>
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
         * <p>The skill parsing error message. This parameter is returned when the skill status is INVALID.</p>
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
         * <p>The source of the skill. Valid values:</p>
         * <ul>
         * <li>User: a skill uploaded by the user.</li>
         * <li>Agent: a skill derived from Agent analysis.</li>
         * </ul>
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
         * <li>INIT: not ready.</li>
         * <li>ACTIVE: active.</li>
         * <li>INVALID: invalid.</li>
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
         * <p>56kv1pvl9uvt9**********bb</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListDataAgentSkillMetaResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentSkillMetaResponseBodyDataContent self = new ListDataAgentSkillMetaResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setAliyunParentUid(String aliyunParentUid) {
            this.aliyunParentUid = aliyunParentUid;
            return this;
        }
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setParseError(String parseError) {
            this.parseError = parseError;
            return this;
        }
        public String getParseError() {
            return this.parseError;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setSkillFrom(String skillFrom) {
            this.skillFrom = skillFrom;
            return this;
        }
        public String getSkillFrom() {
            return this.skillFrom;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setSkillStatus(String skillStatus) {
            this.skillStatus = skillStatus;
            return this;
        }
        public String getSkillStatus() {
            return this.skillStatus;
        }

        public ListDataAgentSkillMetaResponseBodyDataContent setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListDataAgentSkillMetaResponseBodyData extends TeaModel {
        /**
         * <p>The list of data content.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListDataAgentSkillMetaResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static ListDataAgentSkillMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentSkillMetaResponseBodyData self = new ListDataAgentSkillMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentSkillMetaResponseBodyData setContent(java.util.List<ListDataAgentSkillMetaResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDataAgentSkillMetaResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListDataAgentSkillMetaResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDataAgentSkillMetaResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataAgentSkillMetaResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDataAgentSkillMetaResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
