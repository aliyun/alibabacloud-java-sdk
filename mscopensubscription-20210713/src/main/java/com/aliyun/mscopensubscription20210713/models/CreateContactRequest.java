// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateContactRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Email")
    public String email;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Position")
    public String position;

    public static CreateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContactRequest self = new CreateContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateContactRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateContactRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public CreateContactRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateContactRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

}
