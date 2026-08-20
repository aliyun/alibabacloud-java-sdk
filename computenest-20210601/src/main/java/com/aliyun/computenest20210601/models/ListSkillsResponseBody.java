// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of Skills.</p>
     */
    @NameInMap("Skills")
    public java.util.List<ListSkillsResponseBodySkills> skills;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsResponseBody self = new ListSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public ListSkillsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSkillsResponseBodySkillsLocales extends TeaModel {
        @NameInMap("EnValue")
        public String enValue;

        @NameInMap("OriginalValue")
        public String originalValue;

        @NameInMap("ZhValue")
        public String zhValue;

        public static ListSkillsResponseBodySkillsLocales build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodySkillsLocales self = new ListSkillsResponseBodySkillsLocales();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodySkillsLocales setEnValue(String enValue) {
            this.enValue = enValue;
            return this;
        }
        public String getEnValue() {
            return this.enValue;
        }

        public ListSkillsResponseBodySkillsLocales setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
            return this;
        }
        public String getOriginalValue() {
            return this.originalValue;
        }

        public ListSkillsResponseBodySkillsLocales setZhValue(String zhValue) {
            this.zhValue = zhValue;
            return this;
        }
        public String getZhValue() {
            return this.zhValue;
        }

    }

    public static class ListSkillsResponseBodySkills extends TeaModel {
        /**
         * <p>The time when the Skill was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-10T02:22:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The download URL for the Skill package.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator.zip">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator.zip</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Locales")
        public java.util.List<ListSkillsResponseBodySkillsLocales> locales;

        /**
         * <p>The set of connection types that the Skill depends on.</p>
         */
        @NameInMap("RequiredConnections")
        public java.util.List<String> requiredConnections;

        /**
         * <p>The security scan status of the source file.</p>
         */
        @NameInMap("SecurityScanStatus")
        public String securityScanStatus;

        /**
         * <p>The Skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Create new skills, modify and improve existing skills, and measure skill performance.</p>
         */
        @NameInMap("SkillDescription")
        public String skillDescription;

        /**
         * <p>The Skill display name.</p>
         */
        @NameInMap("SkillDisplayName")
        public String skillDisplayName;

        /**
         * <p>Skill ID</p>
         * 
         * <strong>example:</strong>
         * <p>s-xxxxx</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The set of Skill labels.</p>
         */
        @NameInMap("SkillLabels")
        public java.util.List<String> skillLabels;

        /**
         * <p>The Skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-creator</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The ID of the SkillSpace to which the Skill belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-xxxxx</p>
         */
        @NameInMap("SkillSpaceId")
        public String skillSpaceId;

        /**
         * <p>The time when the Skill was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-03T22:58:52Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListSkillsResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodySkills self = new ListSkillsResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodySkills setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSkillsResponseBodySkills setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListSkillsResponseBodySkills setLocales(java.util.List<ListSkillsResponseBodySkillsLocales> locales) {
            this.locales = locales;
            return this;
        }
        public java.util.List<ListSkillsResponseBodySkillsLocales> getLocales() {
            return this.locales;
        }

        public ListSkillsResponseBodySkills setRequiredConnections(java.util.List<String> requiredConnections) {
            this.requiredConnections = requiredConnections;
            return this;
        }
        public java.util.List<String> getRequiredConnections() {
            return this.requiredConnections;
        }

        public ListSkillsResponseBodySkills setSecurityScanStatus(String securityScanStatus) {
            this.securityScanStatus = securityScanStatus;
            return this;
        }
        public String getSecurityScanStatus() {
            return this.securityScanStatus;
        }

        public ListSkillsResponseBodySkills setSkillDescription(String skillDescription) {
            this.skillDescription = skillDescription;
            return this;
        }
        public String getSkillDescription() {
            return this.skillDescription;
        }

        public ListSkillsResponseBodySkills setSkillDisplayName(String skillDisplayName) {
            this.skillDisplayName = skillDisplayName;
            return this;
        }
        public String getSkillDisplayName() {
            return this.skillDisplayName;
        }

        public ListSkillsResponseBodySkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public ListSkillsResponseBodySkills setSkillLabels(java.util.List<String> skillLabels) {
            this.skillLabels = skillLabels;
            return this;
        }
        public java.util.List<String> getSkillLabels() {
            return this.skillLabels;
        }

        public ListSkillsResponseBodySkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListSkillsResponseBodySkills setSkillSpaceId(String skillSpaceId) {
            this.skillSpaceId = skillSpaceId;
            return this;
        }
        public String getSkillSpaceId() {
            return this.skillSpaceId;
        }

        public ListSkillsResponseBodySkills setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
