// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceByDriverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEdgeInstanceDeviceByDriverResponseBody body;

    public static QueryEdgeInstanceDeviceByDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceByDriverResponse self = new QueryEdgeInstanceDeviceByDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceByDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceDeviceByDriverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEdgeInstanceDeviceByDriverResponse setBody(QueryEdgeInstanceDeviceByDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceDeviceByDriverResponseBody getBody() {
        return this.body;
    }

}
