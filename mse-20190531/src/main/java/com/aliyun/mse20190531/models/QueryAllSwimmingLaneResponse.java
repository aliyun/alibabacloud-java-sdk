// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAllSwimmingLaneResponseBody body;

    public static QueryAllSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneResponse self = new QueryAllSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAllSwimmingLaneResponse setBody(QueryAllSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
