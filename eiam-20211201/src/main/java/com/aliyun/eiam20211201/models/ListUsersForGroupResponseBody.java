// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned. The maximum number of entries that can be returned per page is specified by PageSize.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The information about accounts.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListUsersForGroupResponseBodyUsers> users;

    public static ListUsersForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponseBody self = new ListUsersForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersForGroupResponseBody setUsers(java.util.List<ListUsersForGroupResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersForGroupResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersForGroupResponseBodyUsers extends TeaModel {
        @NameInMap("GroupMemberRelationSourceId")
        public String groupMemberRelationSourceId;

        @NameInMap("GroupMemberRelationSourceType")
        public String groupMemberRelationSourceType;

        /**
         * <p>The account ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUsersForGroupResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseBodyUsers self = new ListUsersForGroupResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseBodyUsers setGroupMemberRelationSourceId(String groupMemberRelationSourceId) {
            this.groupMemberRelationSourceId = groupMemberRelationSourceId;
            return this;
        }
        public String getGroupMemberRelationSourceId() {
            return this.groupMemberRelationSourceId;
        }

        public ListUsersForGroupResponseBodyUsers setGroupMemberRelationSourceType(String groupMemberRelationSourceType) {
            this.groupMemberRelationSourceType = groupMemberRelationSourceType;
            return this;
        }
        public String getGroupMemberRelationSourceType() {
            return this.groupMemberRelationSourceType;
        }

        public ListUsersForGroupResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
