// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    /**
     * <p>The date when the account is automatically locked. Specify the date in the yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-28 00:00:00</p>
     */
    @NameInMap("AutoLockTime")
    public String autoLockTime;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>Specifies whether to set the convenience account as a local administrator.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLocalAdmin")
    public Boolean isLocalAdmin;

    /**
     * <p>The initial password. If you do not specify this parameter, a password reset email is sent to the user\&quot;s email address.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The validity period of the password for the user account. By default, the password never expires. You can set this parameter to a value from 30 to 365 to specify the validity period in days. After the password expires, the end user must change the password before logging on again.</p>
     * <blockquote>
     * <p>This feature is in invitational preview. To use this feature, submit a ticket.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PasswordExpireDays")
    public String passwordExpireDays;

    /**
     * <p>The convenience account information.</p>
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

    public CreateUsersRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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
         * <p>The email address. The email address is used to receive relevant emails, such as notification emails for cloud computer allocation. You must specify either the email address or the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username. The username is custom and must be 3 to 24 characters in length. It can contain only lowercase letters, digits, and underscores.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The IDs of the user groups to join.</p>
         */
        @NameInMap("GroupIdList")
        public java.util.List<String> groupIdList;

        /**
         * <p>The organization to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>design</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The account activation type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The user password.</p>
         * <blockquote>
         * <p>The password must be at least 10 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (excluding spaces).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Wuying1234</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The phone number. The phone number is used to receive relevant text messages, such as notification text messages for cloud computer allocation. You must specify either the email address or the phone number.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;Phone numbers are not supported on the international site.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Bean</p>
         */
        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The user remarks.</p>
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

        public CreateUsersRequestUsers setGroupIdList(java.util.List<String> groupIdList) {
            this.groupIdList = groupIdList;
            return this;
        }
        public java.util.List<String> getGroupIdList() {
            return this.groupIdList;
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
