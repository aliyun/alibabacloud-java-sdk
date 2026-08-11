// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainMetasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDomainMetasResponseBody body;

    public static ListDomainMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainMetasResponse self = new ListDomainMetasResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDomainMetasResponse setBody(ListDomainMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainMetasResponseBody getBody() {
        return this.body;
    }

}
