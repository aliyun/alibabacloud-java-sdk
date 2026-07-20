// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetContactRequest extends TeaModel {
    /**
     * <p>The contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1397591</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

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

}
