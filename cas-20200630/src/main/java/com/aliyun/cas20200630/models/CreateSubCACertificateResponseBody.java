// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateSubCACertificateResponseBody extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSubCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCACertificateResponseBody self = new CreateSubCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubCACertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateSubCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
