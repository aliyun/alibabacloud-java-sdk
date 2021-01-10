// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceByDriverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryEdgeInstanceDeviceByDriverResponse setBody(QueryEdgeInstanceDeviceByDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceDeviceByDriverResponseBody getBody() {
        return this.body;
    }

}
