// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEventBridgeIntegrationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventBridgeIntegrationsResponseBody body;

    public static ListEventBridgeIntegrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventBridgeIntegrationsResponse self = new ListEventBridgeIntegrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventBridgeIntegrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventBridgeIntegrationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventBridgeIntegrationsResponse setBody(ListEventBridgeIntegrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventBridgeIntegrationsResponseBody getBody() {
        return this.body;
    }

}
