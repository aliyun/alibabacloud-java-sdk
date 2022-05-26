// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QuerySecurityInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySecurityInfoResponseBody body;

    public static QuerySecurityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityInfoResponse self = new QuerySecurityInfoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecurityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySecurityInfoResponse setBody(QuerySecurityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecurityInfoResponseBody getBody() {
        return this.body;
    }

}
