// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ScrollDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScrollDomainListResponseBody body;

    public static ScrollDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        ScrollDomainListResponse self = new ScrollDomainListResponse();
        return TeaModel.build(map, self);
    }

    public ScrollDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScrollDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScrollDomainListResponse setBody(ScrollDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public ScrollDomainListResponseBody getBody() {
        return this.body;
    }

}
