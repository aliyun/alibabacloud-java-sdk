// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAllSwimmingLaneGroupResponseBody body;

    public static QueryAllSwimmingLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneGroupResponse self = new QueryAllSwimmingLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllSwimmingLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAllSwimmingLaneGroupResponse setBody(QueryAllSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
