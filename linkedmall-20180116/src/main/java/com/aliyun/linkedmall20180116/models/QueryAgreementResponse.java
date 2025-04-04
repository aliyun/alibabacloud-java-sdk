// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAgreementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAgreementResponseBody body;

    public static QueryAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementResponse self = new QueryAgreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgreementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgreementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAgreementResponse setBody(QueryAgreementResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgreementResponseBody getBody() {
        return this.body;
    }

}
