// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContactRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
     */
    @NameInMap("email")
    public String email;

    @NameInMap("imUserIds")
    public java.util.Map<String, String> imUserIds;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>150123456789</p>
     */
    @NameInMap("phone")
    public String phone;

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

}
