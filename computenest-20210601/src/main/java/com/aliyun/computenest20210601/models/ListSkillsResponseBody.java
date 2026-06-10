// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
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

    @NameInMap("Skills")
    public java.util.List<ListSkillsResponseBodySkills> skills;

    /**
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

    public static class ListSkillsResponseBodySkills extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-10T02:22:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://testts-1.oss-cn-beijing.aliyuncs.com/app/yyb_9.1.1.zip">https://testts-1.oss-cn-beijing.aliyuncs.com/app/yyb_9.1.1.zip</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SkillDescription")
        public String skillDescription;

        /**
         * <p>Skill ID</p>
         * 
         * <strong>example:</strong>
         * <p>s-111111</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        @NameInMap("SkillLabels")
        public java.util.List<String> skillLabels;

        /**
         * <strong>example:</strong>
         * <p>reimbursement-print</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <strong>example:</strong>
         * <p>ss-11111</p>
         */
        @NameInMap("SkillSpaceId")
        public String skillSpaceId;

        /**
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

        public ListSkillsResponseBodySkills setSkillDescription(String skillDescription) {
            this.skillDescription = skillDescription;
            return this;
        }
        public String getSkillDescription() {
            return this.skillDescription;
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
