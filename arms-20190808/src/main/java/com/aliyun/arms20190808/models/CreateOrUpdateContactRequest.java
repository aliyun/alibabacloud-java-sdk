// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactRequest extends TeaModel {
    @NameInMap("ContactId")
    public Long contactId;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Email")
    public String email;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("ReissueSendNotice")
    public Long reissueSendNotice;

    public static CreateOrUpdateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactRequest self = new CreateOrUpdateContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public CreateOrUpdateContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateOrUpdateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateOrUpdateContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateOrUpdateContactRequest setReissueSendNotice(Long reissueSendNotice) {
        this.reissueSendNotice = reissueSendNotice;
        return this;
    }
    public Long getReissueSendNotice() {
        return this.reissueSendNotice;
    }

}
