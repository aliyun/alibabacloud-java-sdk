// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnDomainResponseBody body;

    public static DeleteDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnDomainResponse self = new DeleteDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnDomainResponse setBody(DeleteDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
