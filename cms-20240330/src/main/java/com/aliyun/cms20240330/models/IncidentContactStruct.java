// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentContactStruct extends TeaModel {
    @NameInMap("channel")
    public java.util.List<String> channel;

    @NameInMap("contactId")
    public String contactId;

    @NameInMap("contactType")
    public String contactType;

    public static IncidentContactStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentContactStruct self = new IncidentContactStruct();
        return TeaModel.build(map, self);
    }

    public IncidentContactStruct setChannel(java.util.List<String> channel) {
        this.channel = channel;
        return this;
    }
    public java.util.List<String> getChannel() {
        return this.channel;
    }

    public IncidentContactStruct setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public IncidentContactStruct setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

}
