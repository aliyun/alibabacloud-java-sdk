// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class CreateDVOrderAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDVOrderAuditResponseBody body;

    public static CreateDVOrderAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDVOrderAuditResponse self = new CreateDVOrderAuditResponse();
        return TeaModel.build(map, self);
    }

    public CreateDVOrderAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDVOrderAuditResponse setBody(CreateDVOrderAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDVOrderAuditResponseBody getBody() {
        return this.body;
    }

}
