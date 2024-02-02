// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceTunnelResponseBody body;

    public static QueryDeviceTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceTunnelResponse self = new QueryDeviceTunnelResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceTunnelResponse setBody(QueryDeviceTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceTunnelResponseBody getBody() {
        return this.body;
    }

}
