// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    /**
     * <p>The date on which the convenience users are automatically locked.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-03</p>
     */
    @NameInMap("AutoLockTime")
    public String autoLockTime;

    @NameInMap("IsLocalAdmin")
    public Boolean isLocalAdmin;

    /**
     * <p>The initial password. If this parameter is left empty, an email for password reset is sent to the specified email address.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123****</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordExpireDays")
    public String passwordExpireDays;

    /**
     * <p>The information about the convenience user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateUsers</p>
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

    public CreateUsersRequest setIsLocalAdmin(Boolean isLocalAdmin) {
        this.isLocalAdmin = isLocalAdmin;
        return this;
    }
    public Boolean getIsLocalAdmin() {
        return this.isLocalAdmin;
    }

    public CreateUsersRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateUsersRequest setPasswordExpireDays(String passwordExpireDays) {
        this.passwordExpireDays = passwordExpireDays;
        return this;
    }
    public String getPasswordExpireDays() {
        return this.passwordExpireDays;
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
         * <p>The email address of the convenience user. The email address is used to receive notifications about events such as desktop assignment. You must specify an email address or a mobile number to receive notifications.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username of the convenience user. The name can contain lowercase letters, digits, and underscores (_), and must be 3 to 24 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The organization to which the convenience user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1111****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The type of the account ownership.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CreateFromManager: administrator-activated</li>
         * <li>Normal: user-activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The user password.</p>
         * <blockquote>
         * <p> The password must be at least 10 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (excluding spaces).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>password1</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Mobile numbers are not supported on the international site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The display name of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>Bean</p>
         */
        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The remarks on the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>remark1</p>
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
