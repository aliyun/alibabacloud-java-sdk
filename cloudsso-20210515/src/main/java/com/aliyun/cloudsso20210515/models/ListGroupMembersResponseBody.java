// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListGroupMembersResponseBody extends TeaModel {
    @NameInMap("GroupMembers")
    public java.util.List<ListGroupMembersResponseBodyGroupMembers> groupMembers;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListGroupMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupMembersResponseBody self = new ListGroupMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupMembersResponseBody setGroupMembers(java.util.List<ListGroupMembersResponseBodyGroupMembers> groupMembers) {
        this.groupMembers = groupMembers;
        return this;
    }
    public java.util.List<ListGroupMembersResponseBodyGroupMembers> getGroupMembers() {
        return this.groupMembers;
    }

    public ListGroupMembersResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListGroupMembersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupMembersResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListGroupMembersResponseBodyGroupMembers extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("ProvisionType")
        public String provisionType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static ListGroupMembersResponseBodyGroupMembers build(java.util.Map<String, ?> map) throws Exception {
            ListGroupMembersResponseBodyGroupMembers self = new ListGroupMembersResponseBodyGroupMembers();
            return TeaModel.build(map, self);
        }

        public ListGroupMembersResponseBodyGroupMembers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupMembersResponseBodyGroupMembers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGroupMembersResponseBodyGroupMembers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListGroupMembersResponseBodyGroupMembers setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupMembersResponseBodyGroupMembers setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListGroupMembersResponseBodyGroupMembers setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public ListGroupMembersResponseBodyGroupMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGroupMembersResponseBodyGroupMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListGroupMembersResponseBodyGroupMembers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
