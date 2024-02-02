// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryThingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryThingModelResponse setBody(QueryThingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryThingModelResponseBody getBody() {
        return this.body;
    }

}
