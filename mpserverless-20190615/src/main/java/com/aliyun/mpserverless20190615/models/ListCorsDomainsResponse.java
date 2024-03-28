// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListCorsDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCorsDomainsResponseBody body;

    public static ListCorsDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorsDomainsResponse self = new ListCorsDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorsDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCorsDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCorsDomainsResponse setBody(ListCorsDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCorsDomainsResponseBody getBody() {
        return this.body;
    }

}
