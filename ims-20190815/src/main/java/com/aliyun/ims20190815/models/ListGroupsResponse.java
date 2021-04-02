// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("Groups")
    @Validation(required = true)
    public ListGroupsResponseGroups groups;

    public static ListGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponse self = new ListGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListGroupsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListGroupsResponse setGroups(ListGroupsResponseGroups groups) {
        this.groups = groups;
        return this;
    }
    public ListGroupsResponseGroups getGroups() {
        return this.groups;
    }

    public static class ListGroupsResponseGroupsGroup extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        public static ListGroupsResponseGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseGroupsGroup self = new ListGroupsResponseGroupsGroup();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGroupsResponseGroupsGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListGroupsResponseGroupsGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListGroupsResponseGroupsGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGroupsResponseGroupsGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListGroupsResponseGroupsGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class ListGroupsResponseGroups extends TeaModel {
        @NameInMap("Group")
        @Validation(required = true)
        public java.util.List<ListGroupsResponseGroupsGroup> group;

        public static ListGroupsResponseGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseGroups self = new ListGroupsResponseGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseGroups setGroup(java.util.List<ListGroupsResponseGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<ListGroupsResponseGroupsGroup> getGroup() {
            return this.group;
        }

    }

}
