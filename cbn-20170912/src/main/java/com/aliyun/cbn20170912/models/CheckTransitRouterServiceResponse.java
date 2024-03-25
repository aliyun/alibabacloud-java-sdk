// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CheckTransitRouterServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckTransitRouterServiceResponseBody body;

    public static CheckTransitRouterServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTransitRouterServiceResponse self = new CheckTransitRouterServiceResponse();
        return TeaModel.build(map, self);
    }

    public CheckTransitRouterServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTransitRouterServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckTransitRouterServiceResponse setBody(CheckTransitRouterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTransitRouterServiceResponseBody getBody() {
        return this.body;
    }

}
