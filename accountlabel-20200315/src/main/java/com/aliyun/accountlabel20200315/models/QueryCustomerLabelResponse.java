// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class QueryCustomerLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomerLabelResponseBody body;

    public static QueryCustomerLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerLabelResponse self = new QueryCustomerLabelResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomerLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomerLabelResponse setBody(QueryCustomerLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomerLabelResponseBody getBody() {
        return this.body;
    }

}
