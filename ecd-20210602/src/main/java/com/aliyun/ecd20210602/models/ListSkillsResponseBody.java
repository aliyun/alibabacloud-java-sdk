// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of skill details.</p>
     */
    @NameInMap("Skills")
    public java.util.List<ListSkillsResponseBodySkills> skills;

    /**
     * <p>The total number of query results.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsResponseBody self = new ListSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillsResponseBody setSkills(java.util.List<ListSkillsResponseBodySkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<ListSkillsResponseBodySkills> getSkills() {
        return this.skills;
    }

    public ListSkillsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSkillsResponseBodySkillsSkillVersions extends TeaModel {
        @NameInMap("ChangeLog")
        public String changeLog;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("SecurityScanFailReason")
        public String securityScanFailReason;

        @NameInMap("SecurityScanScore")
        public Integer securityScanScore;

        @NameInMap("SecurityScanStatus")
        public String securityScanStatus;

        @NameInMap("Version")
        public String version;

        public static ListSkillsResponseBodySkillsSkillVersions build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodySkillsSkillVersions self = new ListSkillsResponseBodySkillsSkillVersions();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodySkillsSkillVersions setChangeLog(String changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public String getChangeLog() {
            return this.changeLog;
        }

        public ListSkillsResponseBodySkillsSkillVersions setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListSkillsResponseBodySkillsSkillVersions setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListSkillsResponseBodySkillsSkillVersions setSecurityScanFailReason(String securityScanFailReason) {
            this.securityScanFailReason = securityScanFailReason;
            return this;
        }
        public String getSecurityScanFailReason() {
            return this.securityScanFailReason;
        }

        public ListSkillsResponseBodySkillsSkillVersions setSecurityScanScore(Integer securityScanScore) {
            this.securityScanScore = securityScanScore;
            return this;
        }
        public Integer getSecurityScanScore() {
            return this.securityScanScore;
        }

        public ListSkillsResponseBodySkillsSkillVersions setSecurityScanStatus(String securityScanStatus) {
            this.securityScanStatus = securityScanStatus;
            return this;
        }
        public String getSecurityScanStatus() {
            return this.securityScanStatus;
        }

        public ListSkillsResponseBodySkillsSkillVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListSkillsResponseBodySkillsSupportAgentList extends TeaModel {
        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListSkillsResponseBodySkillsSupportAgentList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodySkillsSupportAgentList self = new ListSkillsResponseBodySkillsSupportAgentList();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodySkillsSupportAgentList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListSkillsResponseBodySkillsSupportAgentList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListSkillsResponseBodySkills extends TeaModel {
        /**
         * <p>The API key of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>akm-98f66829***</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The author.</p>
         * 
         * <strong>example:</strong>
         * <p>Li***</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>The currently effective version number. If no version is effective, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>This skill is used for****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>name****</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Indicates whether the skill is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvVars")
        public java.util.Map<String, String> envVars;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-28T10:32:53Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The URL of the skill icon.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<em><strong>-</strong></em>-****</p>
         */
        @NameInMap("SkillIconUrl")
        public String skillIconUrl;

        /**
         * <p>The unique identifier of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>s-04rj8mzqj1fu****</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The name in the SKILL.md file.</p>
         * 
         * <strong>example:</strong>
         * <p>name****</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        @NameInMap("SkillVersions")
        public java.util.List<ListSkillsResponseBodySkillsSkillVersions> skillVersions;

        /**
         * <p>The skill slug identifier, which is user-defined and unique within the tenant dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>find-skills****</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <p>The source marketplace code.</p>
         * 
         * <strong>example:</strong>
         * <p>CLAWHUB</p>
         */
        @NameInMap("SourceMarket")
        public String sourceMarket;

        /**
         * <p>The source marketplace name.</p>
         * 
         * <strong>example:</strong>
         * <p>ClawHub</p>
         */
        @NameInMap("SourceMarketName")
        public String sourceMarketName;

        /**
         * <p>The supply type.</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("SupplierType")
        public String supplierType;

        @NameInMap("SupportAgentList")
        public java.util.List<ListSkillsResponseBodySkillsSupportAgentList> supportAgentList;

        public static ListSkillsResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodySkills self = new ListSkillsResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodySkills setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListSkillsResponseBodySkills setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListSkillsResponseBodySkills setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListSkillsResponseBodySkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillsResponseBodySkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSkillsResponseBodySkills setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListSkillsResponseBodySkills setEnvVars(java.util.Map<String, String> envVars) {
            this.envVars = envVars;
            return this;
        }
        public java.util.Map<String, String> getEnvVars() {
            return this.envVars;
        }

        public ListSkillsResponseBodySkills setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListSkillsResponseBodySkills setSkillIconUrl(String skillIconUrl) {
            this.skillIconUrl = skillIconUrl;
            return this;
        }
        public String getSkillIconUrl() {
            return this.skillIconUrl;
        }

        public ListSkillsResponseBodySkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public ListSkillsResponseBodySkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListSkillsResponseBodySkills setSkillVersions(java.util.List<ListSkillsResponseBodySkillsSkillVersions> skillVersions) {
            this.skillVersions = skillVersions;
            return this;
        }
        public java.util.List<ListSkillsResponseBodySkillsSkillVersions> getSkillVersions() {
            return this.skillVersions;
        }

        public ListSkillsResponseBodySkills setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public ListSkillsResponseBodySkills setSourceMarket(String sourceMarket) {
            this.sourceMarket = sourceMarket;
            return this;
        }
        public String getSourceMarket() {
            return this.sourceMarket;
        }

        public ListSkillsResponseBodySkills setSourceMarketName(String sourceMarketName) {
            this.sourceMarketName = sourceMarketName;
            return this;
        }
        public String getSourceMarketName() {
            return this.sourceMarketName;
        }

        public ListSkillsResponseBodySkills setSupplierType(String supplierType) {
            this.supplierType = supplierType;
            return this;
        }
        public String getSupplierType() {
            return this.supplierType;
        }

        public ListSkillsResponseBodySkills setSupportAgentList(java.util.List<ListSkillsResponseBodySkillsSupportAgentList> supportAgentList) {
            this.supportAgentList = supportAgentList;
            return this;
        }
        public java.util.List<ListSkillsResponseBodySkillsSupportAgentList> getSupportAgentList() {
            return this.supportAgentList;
        }

    }

}
