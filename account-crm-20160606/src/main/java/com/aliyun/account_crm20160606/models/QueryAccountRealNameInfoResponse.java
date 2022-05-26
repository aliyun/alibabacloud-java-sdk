// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountRealNameInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountRealNameInfoResponseBody body;

    public static QueryAccountRealNameInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountRealNameInfoResponse self = new QueryAccountRealNameInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountRealNameInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountRealNameInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountRealNameInfoResponse setBody(QueryAccountRealNameInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountRealNameInfoResponseBody getBody() {
        return this.body;
    }

}
