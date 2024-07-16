// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateMailAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("MailAddressId")
    public String mailAddressId;

    /**
     * <strong>example:</strong>
     * <p>95A7D497-F8DD-4834-B81E-C1783236E55F</p>
     */
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
