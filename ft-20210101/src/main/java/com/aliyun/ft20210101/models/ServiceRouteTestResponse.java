// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class ServiceRouteTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ServiceRouteTestResponseBody body;

    public static ServiceRouteTestResponse build(java.util.Map<String, ?> map) throws Exception {
        ServiceRouteTestResponse self = new ServiceRouteTestResponse();
        return TeaModel.build(map, self);
    }

    public ServiceRouteTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ServiceRouteTestResponse setBody(ServiceRouteTestResponseBody body) {
        this.body = body;
        return this;
    }
    public ServiceRouteTestResponseBody getBody() {
        return this.body;
    }

}
