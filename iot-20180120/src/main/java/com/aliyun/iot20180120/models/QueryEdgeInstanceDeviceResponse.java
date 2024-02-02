// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEdgeInstanceDeviceResponseBody body;

    public static QueryEdgeInstanceDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceResponse self = new QueryEdgeInstanceDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEdgeInstanceDeviceResponse setBody(QueryEdgeInstanceDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceDeviceResponseBody getBody() {
        return this.body;
    }

}
