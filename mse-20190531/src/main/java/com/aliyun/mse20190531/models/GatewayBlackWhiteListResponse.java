// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayBlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GatewayBlackWhiteListResponseBody body;

    public static GatewayBlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        GatewayBlackWhiteListResponse self = new GatewayBlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public GatewayBlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GatewayBlackWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GatewayBlackWhiteListResponse setBody(GatewayBlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public GatewayBlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
