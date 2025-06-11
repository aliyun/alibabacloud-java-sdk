// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListJoinedGroupsForUserResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the queried entries are truncated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The groups to which the user is added.</p>
     */
    @NameInMap("JoinedGroups")
    public java.util.List<ListJoinedGroupsForUserResponseBodyJoinedGroups> joinedGroups;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * <blockquote>
     * <p> This parameter is returned only when the <code>IsTruncated</code> parameter is <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9BBB45F-7877-5DE9-96A5-20E6CFA48929</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListJoinedGroupsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJoinedGroupsForUserResponseBody self = new ListJoinedGroupsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJoinedGroupsForUserResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListJoinedGroupsForUserResponseBody setJoinedGroups(java.util.List<ListJoinedGroupsForUserResponseBodyJoinedGroups> joinedGroups) {
        this.joinedGroups = joinedGroups;
        return this;
    }
    public java.util.List<ListJoinedGroupsForUserResponseBodyJoinedGroups> getJoinedGroups() {
        return this.joinedGroups;
    }

    public ListJoinedGroupsForUserResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJoinedGroupsForUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJoinedGroupsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJoinedGroupsForUserResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListJoinedGroupsForUserResponseBodyJoinedGroups extends TeaModel {
        /**
         * <p>The description of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>g-00jqzghi2n3o5hkh****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the user was added to the group.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T06:58:18Z</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The type of the group. Valid values:</p>
         * <ul>
         * <li>Manual: The group is manually created.</li>
         * <li>Synchronized: The group is synchronized from an external identity provider (IdP).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListJoinedGroupsForUserResponseBodyJoinedGroups build(java.util.Map<String, ?> map) throws Exception {
            ListJoinedGroupsForUserResponseBodyJoinedGroups self = new ListJoinedGroupsForUserResponseBodyJoinedGroups();
            return TeaModel.build(map, self);
        }

        public ListJoinedGroupsForUserResponseBodyJoinedGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJoinedGroupsForUserResponseBodyJoinedGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListJoinedGroupsForUserResponseBodyJoinedGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListJoinedGroupsForUserResponseBodyJoinedGroups setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListJoinedGroupsForUserResponseBodyJoinedGroups setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public ListJoinedGroupsForUserResponseBodyJoinedGroups setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
