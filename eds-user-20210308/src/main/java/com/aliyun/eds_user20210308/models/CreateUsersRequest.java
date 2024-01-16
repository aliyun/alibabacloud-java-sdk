// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    @NameInMap("AutoLockTime")
    public String autoLockTime;

    /**
     * <p>The initial password. If this parameter is left empty, an email for password reset is sent to the specified email address.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Details of the convenience users.</p>
     */
    @NameInMap("Users")
    public java.util.List<CreateUsersRequestUsers> users;

    public static CreateUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersRequest self = new CreateUsersRequest();
        return TeaModel.build(map, self);
    }

    public CreateUsersRequest setAutoLockTime(String autoLockTime) {
        this.autoLockTime = autoLockTime;
        return this;
    }
    public String getAutoLockTime() {
        return this.autoLockTime;
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
         * <p>The email address of the end user. The email address is used to receive notifications about events such as desktop assignment. You must specify an email address or a mobile number to receive notifications.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The name of the end user. The name must be 3 to 24 characters in length, and can contain lowercase letters, digits, and underscores (\_).</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The organization to which the end user belongs.</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The type of the account ownership.</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The password of the end user.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Mobile numbers are not supported on the international site (alibabacloud.com).</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The remarks of the end user.</p>
         */
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

        public CreateUsersRequestUsers setRealNickName(String realNickName) {
            this.realNickName = realNickName;
            return this;
        }
        public String getRealNickName() {
            return this.realNickName;
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
