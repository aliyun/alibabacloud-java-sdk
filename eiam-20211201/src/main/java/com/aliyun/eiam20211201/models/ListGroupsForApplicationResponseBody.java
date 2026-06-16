// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForApplicationResponseBody extends TeaModel {
    /**
     * <p>The list of groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<ListGroupsForApplicationResponseBodyGroups> groups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListGroupsForApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForApplicationResponseBody self = new ListGroupsForApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsForApplicationResponseBody setGroups(java.util.List<ListGroupsForApplicationResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupsForApplicationResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupsForApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsForApplicationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupsForApplicationResponseBodyGroupsApplicationRoles extends TeaModel {
        /**
         * <p>The ID of the application role.</p>
         * 
         * <strong>example:</strong>
         * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        public static ListGroupsForApplicationResponseBodyGroupsApplicationRoles build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForApplicationResponseBodyGroupsApplicationRoles self = new ListGroupsForApplicationResponseBodyGroupsApplicationRoles();
            return TeaModel.build(map, self);
        }

        public ListGroupsForApplicationResponseBodyGroupsApplicationRoles setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

    }

    public static class ListGroupsForApplicationResponseBodyGroups extends TeaModel {
        /**
         * <p>The list of application roles. This parameter is not returned for SAML applications.</p>
         */
        @NameInMap("ApplicationRoles")
        public java.util.List<ListGroupsForApplicationResponseBodyGroupsApplicationRoles> applicationRoles;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_miu8e4t4d7i4u7uwezgr54xxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        public static ListGroupsForApplicationResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForApplicationResponseBodyGroups self = new ListGroupsForApplicationResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForApplicationResponseBodyGroups setApplicationRoles(java.util.List<ListGroupsForApplicationResponseBodyGroupsApplicationRoles> applicationRoles) {
            this.applicationRoles = applicationRoles;
            return this;
        }
        public java.util.List<ListGroupsForApplicationResponseBodyGroupsApplicationRoles> getApplicationRoles() {
            return this.applicationRoles;
        }

        public ListGroupsForApplicationResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
