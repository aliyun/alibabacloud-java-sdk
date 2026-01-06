// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The IDs of the accounts.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListUsersForApplicationResponseBodyUsers> users;

    public static ListUsersForApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForApplicationResponseBody self = new ListUsersForApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForApplicationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersForApplicationResponseBody setUsers(java.util.List<ListUsersForApplicationResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersForApplicationResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersForApplicationResponseBodyUsersApplicationRoles extends TeaModel {
        /**
         * <p>应用角色标识。</p>
         * 
         * <strong>example:</strong>
         * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        public static ListUsersForApplicationResponseBodyUsersApplicationRoles build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForApplicationResponseBodyUsersApplicationRoles self = new ListUsersForApplicationResponseBodyUsersApplicationRoles();
            return TeaModel.build(map, self);
        }

        public ListUsersForApplicationResponseBodyUsersApplicationRoles setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

    }

    public static class ListUsersForApplicationResponseBodyUsers extends TeaModel {
        /**
         * <p>应用角色列表。</p>
         */
        @NameInMap("ApplicationRoles")
        public java.util.List<ListUsersForApplicationResponseBodyUsersApplicationRoles> applicationRoles;

        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUsersForApplicationResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForApplicationResponseBodyUsers self = new ListUsersForApplicationResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForApplicationResponseBodyUsers setApplicationRoles(java.util.List<ListUsersForApplicationResponseBodyUsersApplicationRoles> applicationRoles) {
            this.applicationRoles = applicationRoles;
            return this;
        }
        public java.util.List<ListUsersForApplicationResponseBodyUsersApplicationRoles> getApplicationRoles() {
            return this.applicationRoles;
        }

        public ListUsersForApplicationResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
