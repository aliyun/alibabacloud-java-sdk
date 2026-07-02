// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListPublicSkillsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZ9FmxgN6wKfeK/GOKRnnjU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of skills.</p>
     */
    @NameInMap("Skills")
    public java.util.List<ListPublicSkillsResponseBodySkills> skills;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublicSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicSkillsResponseBody self = new ListPublicSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicSkillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicSkillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicSkillsResponseBody setSkills(java.util.List<ListPublicSkillsResponseBodySkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<ListPublicSkillsResponseBodySkills> getSkills() {
        return this.skills;
    }

    public ListPublicSkillsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicSkillsResponseBodySkillsLocales extends TeaModel {
        @NameInMap("EnValue")
        public String enValue;

        @NameInMap("OriginalValue")
        public String originalValue;

        @NameInMap("ZhValue")
        public String zhValue;

        public static ListPublicSkillsResponseBodySkillsLocales build(java.util.Map<String, ?> map) throws Exception {
            ListPublicSkillsResponseBodySkillsLocales self = new ListPublicSkillsResponseBodySkillsLocales();
            return TeaModel.build(map, self);
        }

        public ListPublicSkillsResponseBodySkillsLocales setEnValue(String enValue) {
            this.enValue = enValue;
            return this;
        }
        public String getEnValue() {
            return this.enValue;
        }

        public ListPublicSkillsResponseBodySkillsLocales setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
            return this;
        }
        public String getOriginalValue() {
            return this.originalValue;
        }

        public ListPublicSkillsResponseBodySkillsLocales setZhValue(String zhValue) {
            this.zhValue = zhValue;
            return this;
        }
        public String getZhValue() {
            return this.zhValue;
        }

    }

    public static class ListPublicSkillsResponseBodySkills extends TeaModel {
        /**
         * <p>The time when the skill was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-11T02:18:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The download URL of the skill package.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://testts-1.oss-cn-beijing.aliyuncs.com/app/yyb_9.1.1.zip">https://testts-1.oss-cn-beijing.aliyuncs.com/app/yyb_9.1.1.zip</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Locales")
        public java.util.List<ListPublicSkillsResponseBodySkillsLocales> locales;

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("SkillDescription")
        public String skillDescription;

        @NameInMap("SkillDisplayName")
        public String skillDisplayName;

        /**
         * <p>Skill ID</p>
         * 
         * <strong>example:</strong>
         * <p>af7e49d9-277f-454a-afc5-1513d41cac31</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The skill label set.</p>
         */
        @NameInMap("SkillLabels")
        public java.util.List<String> skillLabels;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>ziptest</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The ID of the SkillSpace to which the skill belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-1111111</p>
         */
        @NameInMap("SkillSpaceId")
        public String skillSpaceId;

        /**
         * <p>The time when the skill was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-03T22:58:52Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPublicSkillsResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            ListPublicSkillsResponseBodySkills self = new ListPublicSkillsResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public ListPublicSkillsResponseBodySkills setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPublicSkillsResponseBodySkills setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListPublicSkillsResponseBodySkills setLocales(java.util.List<ListPublicSkillsResponseBodySkillsLocales> locales) {
            this.locales = locales;
            return this;
        }
        public java.util.List<ListPublicSkillsResponseBodySkillsLocales> getLocales() {
            return this.locales;
        }

        public ListPublicSkillsResponseBodySkills setSkillDescription(String skillDescription) {
            this.skillDescription = skillDescription;
            return this;
        }
        public String getSkillDescription() {
            return this.skillDescription;
        }

        public ListPublicSkillsResponseBodySkills setSkillDisplayName(String skillDisplayName) {
            this.skillDisplayName = skillDisplayName;
            return this;
        }
        public String getSkillDisplayName() {
            return this.skillDisplayName;
        }

        public ListPublicSkillsResponseBodySkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public ListPublicSkillsResponseBodySkills setSkillLabels(java.util.List<String> skillLabels) {
            this.skillLabels = skillLabels;
            return this;
        }
        public java.util.List<String> getSkillLabels() {
            return this.skillLabels;
        }

        public ListPublicSkillsResponseBodySkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListPublicSkillsResponseBodySkills setSkillSpaceId(String skillSpaceId) {
            this.skillSpaceId = skillSpaceId;
            return this;
        }
        public String getSkillSpaceId() {
            return this.skillSpaceId;
        }

        public ListPublicSkillsResponseBodySkills setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
