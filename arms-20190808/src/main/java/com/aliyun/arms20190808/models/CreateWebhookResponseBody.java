// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateWebhookResponseBody extends TeaModel {
    /**
     * <p>The ID of the contact for webhook alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>48716</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16AF921B-8187-489F-9913-43C808B4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookResponseBody self = new CreateWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebhookResponseBody setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
