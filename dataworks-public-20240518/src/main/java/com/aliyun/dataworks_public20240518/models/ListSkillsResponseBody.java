// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListSkillsResponseBodyPagingInfo pagingInfo;

    /**
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
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Description")
        public String description;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Skills")
        public java.util.List<ListSkillsResponseBodyPagingInfoSkills> skills;

        /**
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
