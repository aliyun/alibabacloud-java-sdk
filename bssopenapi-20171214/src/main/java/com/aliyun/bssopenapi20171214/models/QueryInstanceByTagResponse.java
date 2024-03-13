// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceByTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstanceByTagResponseBody body;

    public static QueryInstanceByTagResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceByTagResponse self = new QueryInstanceByTagResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceByTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceByTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceByTagResponse setBody(QueryInstanceByTagResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceByTagResponseBody getBody() {
        return this.body;
    }

}
