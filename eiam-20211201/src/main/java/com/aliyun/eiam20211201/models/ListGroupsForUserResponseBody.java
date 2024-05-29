// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForUserResponseBody extends TeaModel {
    /**
     * <p>The queried account groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<ListGroupsForUserResponseBodyGroups> groups;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned. The maximum number of entries returned at a time depends on the value of PageSize.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListGroupsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserResponseBody self = new ListGroupsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserResponseBody setGroups(java.util.List<ListGroupsForUserResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupsForUserResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupsForUserResponseBodyGroups extends TeaModel {
        /**
         * <p>The group ID.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupMemberRelationSourceId")
        public String groupMemberRelationSourceId;

        @NameInMap("GroupMemberRelationSourceType")
        public String groupMemberRelationSourceType;

        public static ListGroupsForUserResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseBodyGroups self = new ListGroupsForUserResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForUserResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsForUserResponseBodyGroups setGroupMemberRelationSourceId(String groupMemberRelationSourceId) {
            this.groupMemberRelationSourceId = groupMemberRelationSourceId;
            return this;
        }
        public String getGroupMemberRelationSourceId() {
            return this.groupMemberRelationSourceId;
        }

        public ListGroupsForUserResponseBodyGroups setGroupMemberRelationSourceType(String groupMemberRelationSourceType) {
            this.groupMemberRelationSourceType = groupMemberRelationSourceType;
            return this;
        }
        public String getGroupMemberRelationSourceType() {
            return this.groupMemberRelationSourceType;
        }

    }

}
