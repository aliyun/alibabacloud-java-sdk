// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutDcdnKvNamespaceResponseBody body;

    public static PutDcdnKvNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvNamespaceResponse self = new PutDcdnKvNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDcdnKvNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDcdnKvNamespaceResponse setBody(PutDcdnKvNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDcdnKvNamespaceResponseBody getBody() {
        return this.body;
    }

}
