// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillSpacesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. If this parameter is not returned, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of SkillSpaces.</p>
     */
    @NameInMap("SkillSpaces")
    public java.util.List<ListSkillSpacesResponseBodySkillSpaces> skillSpaces;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSkillSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillSpacesResponseBody self = new ListSkillSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillSpacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillSpacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSkillSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillSpacesResponseBody setSkillSpaces(java.util.List<ListSkillSpacesResponseBodySkillSpaces> skillSpaces) {
        this.skillSpaces = skillSpaces;
        return this;
    }
    public java.util.List<ListSkillSpacesResponseBodySkillSpaces> getSkillSpaces() {
        return this.skillSpaces;
    }

    public ListSkillSpacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSkillSpacesResponseBodySkillSpaces extends TeaModel {
        /**
         * <p>The time when the SkillSpace was created. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-03T22:58:52Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The SkillSpace description.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SkillSpaceDescription")
        public String skillSpaceDescription;

        /**
         * <p>The SkillSpace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-111111</p>
         */
        @NameInMap("SkillSpaceId")
        public String skillSpaceId;

        /**
         * <p>The SkillSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SkillSpaceName")
        public String skillSpaceName;

        /**
         * <p>The time when the SkillSpace was last updated. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-03T22:57:29Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListSkillSpacesResponseBodySkillSpaces build(java.util.Map<String, ?> map) throws Exception {
            ListSkillSpacesResponseBodySkillSpaces self = new ListSkillSpacesResponseBodySkillSpaces();
            return TeaModel.build(map, self);
        }

        public ListSkillSpacesResponseBodySkillSpaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSkillSpacesResponseBodySkillSpaces setSkillSpaceDescription(String skillSpaceDescription) {
            this.skillSpaceDescription = skillSpaceDescription;
            return this;
        }
        public String getSkillSpaceDescription() {
            return this.skillSpaceDescription;
        }

        public ListSkillSpacesResponseBodySkillSpaces setSkillSpaceId(String skillSpaceId) {
            this.skillSpaceId = skillSpaceId;
            return this;
        }
        public String getSkillSpaceId() {
            return this.skillSpaceId;
        }

        public ListSkillSpacesResponseBodySkillSpaces setSkillSpaceName(String skillSpaceName) {
            this.skillSpaceName = skillSpaceName;
            return this;
        }
        public String getSkillSpaceName() {
            return this.skillSpaceName;
        }

        public ListSkillSpacesResponseBodySkillSpaces setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
