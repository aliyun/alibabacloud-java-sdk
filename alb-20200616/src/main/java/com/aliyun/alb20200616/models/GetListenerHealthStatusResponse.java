// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetListenerHealthStatusResponseBody body;

    public static GetListenerHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusResponse self = new GetListenerHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListenerHealthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetListenerHealthStatusResponse setBody(GetListenerHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListenerHealthStatusResponseBody getBody() {
        return this.body;
    }

}
