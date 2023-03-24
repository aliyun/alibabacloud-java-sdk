// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * <br>
     * <p>The description must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The display name of the RAM user.</p>
     * <br>
     * <p>The name must be 1 to 24 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the RAM user.</p>
     * <br>
     * <p>>  This parameter is valid only on the China site (aliyun.com).</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The mobile phone number of the RAM user.</p>
     * <br>
     * <p>Format: Country code-Mobile phone number.</p>
     * <br>
     * <p>>  This parameter is valid only on the China site (aliyun.com).</p>
     */
    @NameInMap("MobilePhone")
    public String mobilePhone;

    @NameInMap("Tag")
    public java.util.List<CreateUserRequestTag> tag;

    /**
     * <p>The logon name of the RAM user.</p>
     * <br>
     * <p>The name is in the format of `<username>@<AccountAlias>.onaliyun.com`. `<username>` indicates the name of the RAM user. `<AccountAlias>.onaliyun.com` indicates the default domain name. For more information about how to obtain the default domain name, see [GetDefaultDomain](~~186720~~).</p>
     * <br>
     * <p>The value of `UserPrincipalName` must be 1 to 128 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (\_). The value of `<AccountAlias>.onaliyun.com` must be 1 to 64 characters in length.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public CreateUserRequest setTag(java.util.List<CreateUserRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateUserRequestTag> getTag() {
        return this.tag;
    }

    public CreateUserRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static class CreateUserRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <br>
         * <p>Valid values of N: 1 to 20. You cannot specify empty strings as tag keys. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <br>
         * <p>Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be a up to128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateUserRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateUserRequestTag self = new CreateUserRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateUserRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateUserRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
