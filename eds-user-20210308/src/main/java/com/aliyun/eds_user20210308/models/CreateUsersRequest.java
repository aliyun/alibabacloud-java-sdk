// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    @NameInMap("Password")
    public String password;

    /**
     * <p>The remarks of the end user.</p>
     */
    @NameInMap("Users")
    public java.util.List<CreateUsersRequestUsers> users;

    public static CreateUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersRequest self = new CreateUsersRequest();
        return TeaModel.build(map, self);
    }

    public CreateUsersRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateUsersRequest setUsers(java.util.List<CreateUsersRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<CreateUsersRequestUsers> getUsers() {
        return this.users;
    }

    public static class CreateUsersRequestUsers extends TeaModel {
        /**
         * <p>The name of the end user.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Details of the convenience user that failed to be created.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The error code returned if the request failed.</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The mobile number of the end user.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The email address of the end user.</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("Remark")
        public String remark;

        public static CreateUsersRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateUsersRequestUsers self = new CreateUsersRequestUsers();
            return TeaModel.build(map, self);
        }

        public CreateUsersRequestUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUsersRequestUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public CreateUsersRequestUsers setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public CreateUsersRequestUsers setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public CreateUsersRequestUsers setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateUsersRequestUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateUsersRequestUsers setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
