// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsCacheDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDnsCacheDomainResponseBody body;

    public static DeleteDnsCacheDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsCacheDomainResponse self = new DeleteDnsCacheDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnsCacheDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDnsCacheDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDnsCacheDomainResponse setBody(DeleteDnsCacheDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDnsCacheDomainResponseBody getBody() {
        return this.body;
    }

}
