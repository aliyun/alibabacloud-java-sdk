// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryAllSwimmingLaneResponse setBody(QueryAllSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
