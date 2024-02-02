// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySubscribeRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySubscribeRelationResponseBody body;

    public static QuerySubscribeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscribeRelationResponse self = new QuerySubscribeRelationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubscribeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySubscribeRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySubscribeRelationResponse setBody(QuerySubscribeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySubscribeRelationResponseBody getBody() {
        return this.body;
    }

}
