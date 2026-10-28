// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContactResponseBody extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("contactId")
    public String contactId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContactResponseBody self = new CreateContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContactResponseBody setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
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
