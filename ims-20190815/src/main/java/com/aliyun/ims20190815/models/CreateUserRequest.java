// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * <p>The description must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a cloud computing engineer.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The display name of the RAM user.</p>
     * <p>The name must be 1 to 24 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the RAM user.</p>
     * <blockquote>
     * <p>This parameter is valid only on the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The mobile number of the RAM user.</p>
     * <p>Format: Country code-Mobile phone number.</p>
     * <blockquote>
     * <p>This parameter is valid only on the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86-1868888****</p>
     */
    @NameInMap("MobilePhone")
    public String mobilePhone;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateUserRequestTag> tag;

    /**
     * <p>The logon name of the Resource Access Management (RAM) user.</p>
     * <p>The name is in the format of <code>&lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code>. <code>&lt;username&gt;</code> indicates the name of the RAM user. <code>&lt;AccountAlias&gt;.onaliyun.com</code> indicates the default domain name. For more information about how to query the default domain name, see <a href="https://help.aliyun.com/document_detail/186720.html">GetDefaultDomain</a>.</p>
     * <p>The value of <code>UserPrincipalName</code> must be <code>1 to 128</code> characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The value of <code>&lt;username&gt;</code> must be <code>1 to 64</code> characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
         * <p>The key of the tag.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <p>The tag value can be an empty string. The tag value can be up to 128 characters in length. The tag value cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
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
