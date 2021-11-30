// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRootCACertificateResponseBody extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateRootCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRootCACertificateResponseBody self = new CreateRootCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRootCACertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateRootCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
