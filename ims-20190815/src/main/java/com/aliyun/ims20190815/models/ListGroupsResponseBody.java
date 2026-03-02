// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListGroupsResponseBody extends TeaModel {
    @NameInMap("Groups")
    public ListGroupsResponseBodyGroups groups;

    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The <code>marker</code>. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>065527AA-2F2E-AD7C-7484-F2626CFE4934</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponseBody self = new ListGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponseBody setGroups(ListGroupsResponseBodyGroups groups) {
        this.groups = groups;
        return this;
    }
    public ListGroupsResponseBodyGroups getGroups() {
        return this.groups;
    }

    public ListGroupsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListGroupsResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGroupsResponseBodyGroupsGroup extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListGroupsResponseBodyGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyGroupsGroup self = new ListGroupsResponseBodyGroupsGroup();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyGroupsGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListGroupsResponseBodyGroupsGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListGroupsResponseBodyGroupsGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGroupsResponseBodyGroupsGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsResponseBodyGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGroupsResponseBodyGroupsGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("Group")
        public java.util.List<ListGroupsResponseBodyGroupsGroup> group;

        public static ListGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyGroups self = new ListGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyGroups setGroup(java.util.List<ListGroupsResponseBodyGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<ListGroupsResponseBodyGroupsGroup> getGroup() {
            return this.group;
        }

    }

}
