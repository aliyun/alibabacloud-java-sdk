// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDomainResponseBody body;

    public static DeleteDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResponse self = new DeleteDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainResponse setBody(DeleteDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainResponseBody getBody() {
        return this.body;
    }

}
