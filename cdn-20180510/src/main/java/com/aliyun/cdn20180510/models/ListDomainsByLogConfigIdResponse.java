// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListDomainsByLogConfigIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDomainsByLogConfigIdResponseBody body;

    public static ListDomainsByLogConfigIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsByLogConfigIdResponse self = new ListDomainsByLogConfigIdResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainsByLogConfigIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainsByLogConfigIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDomainsByLogConfigIdResponse setBody(ListDomainsByLogConfigIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainsByLogConfigIdResponseBody getBody() {
        return this.body;
    }

}
