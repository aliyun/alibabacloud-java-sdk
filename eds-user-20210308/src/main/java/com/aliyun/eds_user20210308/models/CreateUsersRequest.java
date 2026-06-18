// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    /**
     * <p>The date and time when the system automatically locks the convenience user\&quot;s account. The value must be in the <code>yyyy-MM-dd HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-28 00:00:00</p>
     */
    @NameInMap("AutoLockTime")
    public String autoLockTime;

    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>Specifies whether to set the convenience user as a local administrator.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLocalAdmin")
    public Boolean isLocalAdmin;

    /**
     * <p>The initial password. If you do not specify this parameter, the system sends a password reset email to the convenience user\&quot;s email address.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>By default, a convenience user\&quot;s password does not expire. You can use this parameter to specify a password validity period of 30 to 365 days. After the password expires, the user must reset it to log in again.</p>
     * <blockquote>
     * <p>This feature is in invited preview. To use this feature, submit a ticket.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PasswordExpireDays")
    public String passwordExpireDays;

    /**
     * <p>Details about the convenience users.</p>
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
         * <p>The email address of the convenience user. This email address is used for notifications, such as an alert when a cloud computer is assigned. You must specify either this parameter or the <code>Phone</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The user name. The user name must be 3 to 24 characters long and can contain lowercase letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("GroupIdList")
        public java.util.List<String> groupIdList;

        /**
         * <p>The ID of the organization to which the convenience user belongs.</p>
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
         * <p>The password for the convenience user.</p>
         * <blockquote>
         * <p>The password must be at least 10 characters long and contain characters from at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (excluding spaces).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Wuying1234</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The phone number of the convenience user. This phone number is used for notifications, such as a text message when a cloud computer is assigned. You must specify either this parameter or the <code>Email</code> parameter.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Phone numbers are not supported on the international site.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The display name of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>Bean</p>
         */
        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>A remark for the convenience user.</p>
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
