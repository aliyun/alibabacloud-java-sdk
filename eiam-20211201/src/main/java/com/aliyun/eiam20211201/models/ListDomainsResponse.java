// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDomainsResponseBody body;

    public static ListDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponse self = new ListDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDomainsResponse setBody(ListDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainsResponseBody getBody() {
        return this.body;
    }

}
