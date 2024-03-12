// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListExpressConnectRouterSupportedRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExpressConnectRouterSupportedRegionResponseBody body;

    public static ListExpressConnectRouterSupportedRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExpressConnectRouterSupportedRegionResponse self = new ListExpressConnectRouterSupportedRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListExpressConnectRouterSupportedRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExpressConnectRouterSupportedRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExpressConnectRouterSupportedRegionResponse setBody(ListExpressConnectRouterSupportedRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExpressConnectRouterSupportedRegionResponseBody getBody() {
        return this.body;
    }

}
