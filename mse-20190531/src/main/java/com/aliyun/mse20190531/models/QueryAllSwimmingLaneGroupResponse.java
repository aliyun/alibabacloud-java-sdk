// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryAllSwimmingLaneGroupResponse setBody(QueryAllSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
