// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CheckAddRegionToExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAddRegionToExpressConnectRouterResponseBody body;

    public static CheckAddRegionToExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAddRegionToExpressConnectRouterResponse self = new CheckAddRegionToExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public CheckAddRegionToExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAddRegionToExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAddRegionToExpressConnectRouterResponse setBody(CheckAddRegionToExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAddRegionToExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
