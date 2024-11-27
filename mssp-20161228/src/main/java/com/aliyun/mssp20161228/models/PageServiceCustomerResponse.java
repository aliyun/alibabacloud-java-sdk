// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class PageServiceCustomerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageServiceCustomerResponseBody body;

    public static PageServiceCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        PageServiceCustomerResponse self = new PageServiceCustomerResponse();
        return TeaModel.build(map, self);
    }

    public PageServiceCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageServiceCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageServiceCustomerResponse setBody(PageServiceCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public PageServiceCustomerResponseBody getBody() {
        return this.body;
    }

}
