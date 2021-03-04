// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAvailableInstancesResponseBody body;

    public static QueryAvailableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableInstancesResponse self = new QueryAvailableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvailableInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvailableInstancesResponse setBody(QueryAvailableInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvailableInstancesResponseBody getBody() {
        return this.body;
    }

}
