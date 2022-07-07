// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class RemoveDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDomainResponseBody body;

    public static RemoveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDomainResponse self = new RemoveDomainResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDomainResponse setBody(RemoveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDomainResponseBody getBody() {
        return this.body;
    }

}
