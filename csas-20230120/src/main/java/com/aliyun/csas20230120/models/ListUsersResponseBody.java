// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public String totalNum;

    @NameInMap("Users")
    public java.util.List<ListUsersResponseBodyUsers> users;

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

    public ListUsersResponseBody setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public ListUsersResponseBody setUsers(java.util.List<ListUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("IdpName")
        public String idpName;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Username")
        public String username;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsers setIdpName(String idpName) {
            this.idpName = idpName;
            return this;
        }
        public String getIdpName() {
            return this.idpName;
        }

        public ListUsersResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListUsersResponseBodyUsers setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListUsersResponseBodyUsers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUsersResponseBodyUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
