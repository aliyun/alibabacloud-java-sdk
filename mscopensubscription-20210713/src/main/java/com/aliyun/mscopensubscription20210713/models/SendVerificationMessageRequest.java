// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class SendVerificationMessageRequest extends TeaModel {
    @NameInMap("ContactId")
    public Long contactId;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("Type")
    public Integer type;

    public static SendVerificationMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationMessageRequest self = new SendVerificationMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendVerificationMessageRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public SendVerificationMessageRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public SendVerificationMessageRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
