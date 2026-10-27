// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContactRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("contactId")
    public String contactId;

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
     * <p>test_07</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>13012345678</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>default-cms-5884500827389836-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContactRequest self = new CreateContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateContactRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateContactRequest setImUserIds(java.util.Map<String, String> imUserIds) {
        this.imUserIds = imUserIds;
        return this;
    }
    public java.util.Map<String, String> getImUserIds() {
        return this.imUserIds;
    }

    public CreateContactRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateContactRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
