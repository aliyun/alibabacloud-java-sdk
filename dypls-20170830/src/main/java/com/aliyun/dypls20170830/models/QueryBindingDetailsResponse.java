// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryBindingDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBindingDetailsResponseBody body;

    public static QueryBindingDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBindingDetailsResponse self = new QueryBindingDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBindingDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBindingDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBindingDetailsResponse setBody(QueryBindingDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBindingDetailsResponseBody getBody() {
        return this.body;
    }

}
