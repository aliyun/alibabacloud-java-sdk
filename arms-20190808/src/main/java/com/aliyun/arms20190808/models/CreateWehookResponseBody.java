// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateWehookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContactId")
    public String contactId;

    public static CreateWehookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWehookResponseBody self = new CreateWehookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWehookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWehookResponseBody setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

}
