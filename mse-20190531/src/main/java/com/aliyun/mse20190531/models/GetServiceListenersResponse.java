// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListenersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceListenersResponseBody body;

    public static GetServiceListenersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListenersResponse self = new GetServiceListenersResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceListenersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceListenersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceListenersResponse setBody(GetServiceListenersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceListenersResponseBody getBody() {
        return this.body;
    }

}
