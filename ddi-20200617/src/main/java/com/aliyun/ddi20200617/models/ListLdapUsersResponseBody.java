// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListLdapUsersResponseBody extends TeaModel {
    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserList")
    public ListLdapUsersResponseBodyUserList userList;

    public static ListLdapUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLdapUsersResponseBody self = new ListLdapUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLdapUsersResponseBody setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public ListLdapUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLdapUsersResponseBody setUserList(ListLdapUsersResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public ListLdapUsersResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class ListLdapUsersResponseBodyUserListUser extends TeaModel {
        @NameInMap("UserCreateTime")
        public Long userCreateTime;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Note")
        public String note;

        @NameInMap("KeytabHex")
        public String keytabHex;

        @NameInMap("UserName")
        public String userName;

        public static ListLdapUsersResponseBodyUserListUser build(java.util.Map<String, ?> map) throws Exception {
            ListLdapUsersResponseBodyUserListUser self = new ListLdapUsersResponseBodyUserListUser();
            return TeaModel.build(map, self);
        }

        public ListLdapUsersResponseBodyUserListUser setUserCreateTime(Long userCreateTime) {
            this.userCreateTime = userCreateTime;
            return this;
        }
        public Long getUserCreateTime() {
            return this.userCreateTime;
        }

        public ListLdapUsersResponseBodyUserListUser setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListLdapUsersResponseBodyUserListUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListLdapUsersResponseBodyUserListUser setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListLdapUsersResponseBodyUserListUser setKeytabHex(String keytabHex) {
            this.keytabHex = keytabHex;
            return this;
        }
        public String getKeytabHex() {
            return this.keytabHex;
        }

        public ListLdapUsersResponseBodyUserListUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListLdapUsersResponseBodyUserList extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListLdapUsersResponseBodyUserListUser> user;

        public static ListLdapUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            ListLdapUsersResponseBodyUserList self = new ListLdapUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public ListLdapUsersResponseBodyUserList setUser(java.util.List<ListLdapUsersResponseBodyUserListUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListLdapUsersResponseBodyUserListUser> getUser() {
            return this.user;
        }

    }

}
