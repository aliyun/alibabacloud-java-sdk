// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteNotificationContactsRequest extends TeaModel {
    @NameInMap("ContactTypes")
    public String contactTypes;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteNotificationContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationContactsRequest self = new DeleteNotificationContactsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationContactsRequest setContactTypes(String contactTypes) {
        this.contactTypes = contactTypes;
        return this;
    }
    public String getContactTypes() {
        return this.contactTypes;
    }

    public DeleteNotificationContactsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNotificationContactsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
