// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListSkillsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsResponseBody self = new ListSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillsResponseBody setPagingInfo(ListSkillsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListSkillsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSkillsResponseBodyPagingInfoSkills extends TeaModel {
        /**
         * <p><strong>The creator ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p><strong>The Skill description.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>数据分析技能</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p><strong>The modifier ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p><strong>The Skill name.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p><strong>The visibility level.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListSkillsResponseBodyPagingInfoSkills build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodyPagingInfoSkills self = new ListSkillsResponseBodyPagingInfoSkills();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodyPagingInfoSkills setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListSkillsResponseBodyPagingInfoSkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillsResponseBodyPagingInfoSkills setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListSkillsResponseBodyPagingInfoSkills setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListSkillsResponseBodyPagingInfoSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillsResponseBodyPagingInfoSkills setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListSkillsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The maximum number of results returned in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of results. This parameter is null or empty if all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The list of Skills.</p>
         */
        @NameInMap("Skills")
        public java.util.List<ListSkillsResponseBodyPagingInfoSkills> skills;

        /**
         * <p>The total number of results that match the query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodyPagingInfo self = new ListSkillsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodyPagingInfo setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListSkillsResponseBodyPagingInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListSkillsResponseBodyPagingInfo setSkills(java.util.List<ListSkillsResponseBodyPagingInfoSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<ListSkillsResponseBodyPagingInfoSkills> getSkills() {
            return this.skills;
        }

        public ListSkillsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
