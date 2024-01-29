// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetAppMessageQueueRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppMessageQueueRouteResponseBody body;

    public static GetAppMessageQueueRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppMessageQueueRouteResponse self = new GetAppMessageQueueRouteResponse();
        return TeaModel.build(map, self);
    }

    public GetAppMessageQueueRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppMessageQueueRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppMessageQueueRouteResponse setBody(GetAppMessageQueueRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppMessageQueueRouteResponseBody getBody() {
        return this.body;
    }

}
