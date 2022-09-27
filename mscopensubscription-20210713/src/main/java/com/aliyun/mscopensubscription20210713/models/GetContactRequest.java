// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetContactRequest extends TeaModel {
    @NameInMap("ContactId")
    public Long contactId;

    @NameInMap("Locale")
    public String locale;

    public static GetContactRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContactRequest self = new GetContactRequest();
        return TeaModel.build(map, self);
    }

    public GetContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public GetContactRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
