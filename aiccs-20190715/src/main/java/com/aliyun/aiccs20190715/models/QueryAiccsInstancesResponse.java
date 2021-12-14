// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryAiccsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAiccsInstancesResponseBody body;

    public static QueryAiccsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiccsInstancesResponse self = new QueryAiccsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiccsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiccsInstancesResponse setBody(QueryAiccsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiccsInstancesResponseBody getBody() {
        return this.body;
    }

}
