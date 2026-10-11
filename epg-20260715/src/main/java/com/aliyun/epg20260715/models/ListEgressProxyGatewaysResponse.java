// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEgressProxyGatewaysResponseBody body;

    public static ListEgressProxyGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyGatewaysResponse self = new ListEgressProxyGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEgressProxyGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEgressProxyGatewaysResponse setBody(ListEgressProxyGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEgressProxyGatewaysResponseBody getBody() {
        return this.body;
    }

}
