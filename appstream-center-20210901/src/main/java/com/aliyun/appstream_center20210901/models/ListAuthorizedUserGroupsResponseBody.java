// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUserGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the user groups.</p>
     */
    @NameInMap("UserGroups")
    public java.util.List<ListAuthorizedUserGroupsResponseBodyUserGroups> userGroups;

    public static ListAuthorizedUserGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUserGroupsResponseBody self = new ListAuthorizedUserGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUserGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedUserGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedUserGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedUserGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAuthorizedUserGroupsResponseBody setUserGroups(java.util.List<ListAuthorizedUserGroupsResponseBodyUserGroups> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<ListAuthorizedUserGroupsResponseBodyUserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static class ListAuthorizedUserGroupsResponseBodyUserGroups extends TeaModel {
        /**
         * <p>The ID of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The authorization mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>App: authorizes access to apps.</li>
         * <li>AppInstanceGroup: authorizes access to delivery groups.</li>
         * <li>Session: authorizes access to sessions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        @NameInMap("AuthMode")
        public String authMode;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-00001</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the user group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static ListAuthorizedUserGroupsResponseBodyUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedUserGroupsResponseBodyUserGroups self = new ListAuthorizedUserGroupsResponseBodyUserGroups();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedUserGroupsResponseBodyUserGroups setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListAuthorizedUserGroupsResponseBodyUserGroups setAuthMode(String authMode) {
            this.authMode = authMode;
            return this;
        }
        public String getAuthMode() {
            return this.authMode;
        }

        public ListAuthorizedUserGroupsResponseBodyUserGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListAuthorizedUserGroupsResponseBodyUserGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
