// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListJoinedGroupsForUserResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("JoinedGroups")
    public java.util.List<ListJoinedGroupsForUserResponseBodyJoinedGroups> joinedGroups;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("ProvisionType")
        public String provisionType;

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
