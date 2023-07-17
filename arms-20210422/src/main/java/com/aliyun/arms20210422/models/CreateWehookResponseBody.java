// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateWehookResponseBody extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateWehookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWehookResponseBody self = new CreateWehookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWehookResponseBody setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateWehookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
