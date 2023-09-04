// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListGroupMembersResponseBody extends TeaModel {
    /**
     * <p>The users in the group.</p>
     */
    @NameInMap("GroupMembers")
    public java.util.List<ListGroupMembersResponseBodyGroupMembers> groupMembers;

    /**
     * <p>Indicates whether the queried entries are truncated. Valid values:</p>
     * <br>
     * <p>*   true: The queried entries are truncated.</p>
     * <p>*   false: The queried entries are not truncated.</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is returned for the next page.</p>
     * <br>
     * <p>>  This parameter is returned only when the value of `IsTruncated` is `true`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The description of the user.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the user was added to the user group.</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The type of the user. Valid values:</p>
         * <br>
         * <p>*   Manual: The user is manually created.</p>
         * <p>*   Synchronized: The user is synchronized from an external identity provider (IdP).</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The status of the user. Valid values:</p>
         * <br>
         * <p>*   Enabled: The logon of the user is enabled.</p>
         * <p>*   Disabled: The logon of the user is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The name of the user.</p>
         */
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
