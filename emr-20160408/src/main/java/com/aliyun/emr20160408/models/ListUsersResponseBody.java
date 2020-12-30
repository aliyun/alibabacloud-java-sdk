// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserList")
    public ListUsersResponseBodyUserList userList;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setUserList(ListUsersResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public ListUsersResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class ListUsersResponseBodyUserListUser extends TeaModel {
        @NameInMap("LinuxStatus")
        public String linuxStatus;

        @NameInMap("K8sStatus")
        public String k8sStatus;

        @NameInMap("KnoxStatus")
        public String knoxStatus;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("KerberosStatus")
        public String kerberosStatus;

        @NameInMap("UserName")
        public String userName;

        public static ListUsersResponseBodyUserListUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUserListUser self = new ListUsersResponseBodyUserListUser();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUserListUser setLinuxStatus(String linuxStatus) {
            this.linuxStatus = linuxStatus;
            return this;
        }
        public String getLinuxStatus() {
            return this.linuxStatus;
        }

        public ListUsersResponseBodyUserListUser setK8sStatus(String k8sStatus) {
            this.k8sStatus = k8sStatus;
            return this;
        }
        public String getK8sStatus() {
            return this.k8sStatus;
        }

        public ListUsersResponseBodyUserListUser setKnoxStatus(String knoxStatus) {
            this.knoxStatus = knoxStatus;
            return this;
        }
        public String getKnoxStatus() {
            return this.knoxStatus;
        }

        public ListUsersResponseBodyUserListUser setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListUsersResponseBodyUserListUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUserListUser setKerberosStatus(String kerberosStatus) {
            this.kerberosStatus = kerberosStatus;
            return this;
        }
        public String getKerberosStatus() {
            return this.kerberosStatus;
        }

        public ListUsersResponseBodyUserListUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListUsersResponseBodyUserList extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersResponseBodyUserListUser> user;

        public static ListUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUserList self = new ListUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUserList setUser(java.util.List<ListUsersResponseBodyUserListUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUserListUser> getUser() {
            return this.user;
        }

    }

}
