// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class QueryServiceEnableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryServiceEnableResponseBody body;

    public static QueryServiceEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceEnableResponse self = new QueryServiceEnableResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServiceEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryServiceEnableResponse setBody(QueryServiceEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServiceEnableResponseBody getBody() {
        return this.body;
    }

}
