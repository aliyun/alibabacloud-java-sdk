// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListGroupsForUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Groups")
    @Validation(required = true)
    public ListGroupsForUserResponseGroups groups;

    public static ListGroupsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserResponse self = new ListGroupsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsForUserResponse setGroups(ListGroupsForUserResponseGroups groups) {
        this.groups = groups;
        return this;
    }
    public ListGroupsForUserResponseGroups getGroups() {
        return this.groups;
    }

    public static class ListGroupsForUserResponseGroupsGroup extends TeaModel {
        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("JoinDate")
        @Validation(required = true)
        public String joinDate;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        public static ListGroupsForUserResponseGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseGroupsGroup self = new ListGroupsForUserResponseGroupsGroup();
            return TeaModel.build(map, self);
        }

        public ListGroupsForUserResponseGroupsGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGroupsForUserResponseGroupsGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListGroupsForUserResponseGroupsGroup setJoinDate(String joinDate) {
            this.joinDate = joinDate;
            return this;
        }
        public String getJoinDate() {
            return this.joinDate;
        }

        public ListGroupsForUserResponseGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGroupsForUserResponseGroupsGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class ListGroupsForUserResponseGroups extends TeaModel {
        @NameInMap("Group")
        @Validation(required = true)
        public java.util.List<ListGroupsForUserResponseGroupsGroup> group;

        public static ListGroupsForUserResponseGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseGroups self = new ListGroupsForUserResponseGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForUserResponseGroups setGroup(java.util.List<ListGroupsForUserResponseGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<ListGroupsForUserResponseGroupsGroup> getGroup() {
            return this.group;
        }

    }

}
