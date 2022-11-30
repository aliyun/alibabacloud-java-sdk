// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class QueryHomeStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHomeStatResponseBody body;

    public static QueryHomeStatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHomeStatResponse self = new QueryHomeStatResponse();
        return TeaModel.build(map, self);
    }

    public QueryHomeStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHomeStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHomeStatResponse setBody(QueryHomeStatResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHomeStatResponseBody getBody() {
        return this.body;
    }

}
