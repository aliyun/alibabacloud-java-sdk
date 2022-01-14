// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMappCenterAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMappCenterAppResponseBody body;

    public static QueryMappCenterAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMappCenterAppResponse self = new QueryMappCenterAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryMappCenterAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMappCenterAppResponse setBody(QueryMappCenterAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMappCenterAppResponseBody getBody() {
        return this.body;
    }

}
