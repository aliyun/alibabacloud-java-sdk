// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryThingModelResponseBody body;

    public static QueryThingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelResponse self = new QueryThingModelResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryThingModelResponse setBody(QueryThingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryThingModelResponseBody getBody() {
        return this.body;
    }

}
