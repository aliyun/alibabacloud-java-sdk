// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountProfileInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountProfileInfoResponseBody body;

    public static QueryAccountProfileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountProfileInfoResponse self = new QueryAccountProfileInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountProfileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountProfileInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountProfileInfoResponse setBody(QueryAccountProfileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountProfileInfoResponseBody getBody() {
        return this.body;
    }

}
