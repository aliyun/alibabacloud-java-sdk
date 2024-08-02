// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class DeleteContactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Locale")
    public String locale;

    public static DeleteContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactRequest self = new DeleteContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public DeleteContactRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
