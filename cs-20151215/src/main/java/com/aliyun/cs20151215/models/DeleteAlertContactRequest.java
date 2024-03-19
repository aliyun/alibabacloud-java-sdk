// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAlertContactRequest extends TeaModel {
    @NameInMap("contact_ids")
    public java.util.List<Long> contactIds;

    public static DeleteAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactRequest self = new DeleteAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactRequest setContactIds(java.util.List<Long> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

}
