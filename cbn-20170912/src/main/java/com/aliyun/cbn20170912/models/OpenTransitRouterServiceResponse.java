// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class OpenTransitRouterServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenTransitRouterServiceResponseBody body;

    public static OpenTransitRouterServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenTransitRouterServiceResponse self = new OpenTransitRouterServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenTransitRouterServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenTransitRouterServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenTransitRouterServiceResponse setBody(OpenTransitRouterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenTransitRouterServiceResponseBody getBody() {
        return this.body;
    }

}
