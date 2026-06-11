// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ContactForIncidentView extends TeaModel {
    /**
     * <p>The contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;contact-123456&quot;</p>
     */
    @NameInMap("contactId")
    public String contactId;

    /**
     * <p>The contact name.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;张三&quot;</p>
     */
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
