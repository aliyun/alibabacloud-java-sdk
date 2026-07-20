// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateContactResponseBody extends TeaModel {
    /**
     * <p>The contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1352570</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71CE8C5B-3737-52A9-97D0-2A9746059A45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContactResponseBody self = new CreateContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContactResponseBody setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public CreateContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
