// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContactId")
    public String contactId;

    public static CreateAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactResponseBody self = new CreateAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAlertContactResponseBody setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

}
