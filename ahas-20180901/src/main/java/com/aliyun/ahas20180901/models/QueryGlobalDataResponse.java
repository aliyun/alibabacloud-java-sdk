// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryGlobalDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGlobalDataResponseBody body;

    public static QueryGlobalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGlobalDataResponse self = new QueryGlobalDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryGlobalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGlobalDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGlobalDataResponse setBody(QueryGlobalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGlobalDataResponseBody getBody() {
        return this.body;
    }

}
