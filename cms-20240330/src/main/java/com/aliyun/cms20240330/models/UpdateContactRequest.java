// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContactRequest extends TeaModel {
    /**
     * <p>The email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The mapping of instant messaging (IM) user IDs. Multiple IM tools are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dingtalk&quot;:&quot;abc123&quot;,&quot;wechat&quot;:&quot;def456&quot;}</p>
     */
    @NameInMap("imUserIds")
    public java.util.Map<String, String> imUserIds;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The name of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The mobile phone number of the contact. Currently, only mobile phone numbers in China are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>150123456789</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The country code of the mobile phone number, which is typically +86 for China.</p>
     * 
     * <strong>example:</strong>
     * <p>+86</p>
     */
    @NameInMap("phoneCode")
    public String phoneCode;

    public static UpdateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactRequest self = new UpdateContactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateContactRequest setImUserIds(java.util.Map<String, String> imUserIds) {
        this.imUserIds = imUserIds;
        return this;
    }
    public java.util.Map<String, String> getImUserIds() {
        return this.imUserIds;
    }

    public UpdateContactRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateContactRequest setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }
    public String getPhoneCode() {
        return this.phoneCode;
    }

}
