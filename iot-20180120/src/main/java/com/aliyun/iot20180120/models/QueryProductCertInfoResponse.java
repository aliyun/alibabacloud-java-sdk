// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductCertInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProductCertInfoResponseBody body;

    public static QueryProductCertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductCertInfoResponse self = new QueryProductCertInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductCertInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductCertInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProductCertInfoResponse setBody(QueryProductCertInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductCertInfoResponseBody getBody() {
        return this.body;
    }

}
