// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    @NameInMap("Users")
    public java.util.List<CreateUsersRequestUsers> users;

    @NameInMap("Password")
    public String password;

    public static CreateUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersRequest self = new CreateUsersRequest();
        return TeaModel.build(map, self);
    }

    public CreateUsersRequest setUsers(java.util.List<CreateUsersRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<CreateUsersRequestUsers> getUsers() {
        return this.users;
    }

    public CreateUsersRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public static class CreateUsersRequestUsers extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Email")
        public String email;

        @NameInMap("Phone")
        public String phone;

        public static CreateUsersRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateUsersRequestUsers self = new CreateUsersRequestUsers();
            return TeaModel.build(map, self);
        }

        public CreateUsersRequestUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public CreateUsersRequestUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUsersRequestUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
