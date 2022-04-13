// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateMailAddressResponseBody extends TeaModel {
    @NameInMap("MailAddressId")
    public String mailAddressId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMailAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMailAddressResponseBody self = new CreateMailAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMailAddressResponseBody setMailAddressId(String mailAddressId) {
        this.mailAddressId = mailAddressId;
        return this;
    }
    public String getMailAddressId() {
        return this.mailAddressId;
    }

    public CreateMailAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
