// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class OpenTransitRouterServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OpenTransitRouterServiceResponse setBody(OpenTransitRouterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenTransitRouterServiceResponseBody getBody() {
        return this.body;
    }

}
