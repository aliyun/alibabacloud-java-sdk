// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ContactForIncidentView extends TeaModel {
    @NameInMap("contactId")
    public String contactId;

    @NameInMap("name")
    public String name;

    public static ContactForIncidentView build(java.util.Map<String, ?> map) throws Exception {
        ContactForIncidentView self = new ContactForIncidentView();
        return TeaModel.build(map, self);
    }

    public ContactForIncidentView setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ContactForIncidentView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
