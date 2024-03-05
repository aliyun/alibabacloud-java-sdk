// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryDomainTransferStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainTransferStatusResponseBody body;

    public static QueryDomainTransferStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainTransferStatusResponse self = new QueryDomainTransferStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainTransferStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainTransferStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainTransferStatusResponse setBody(QueryDomainTransferStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainTransferStatusResponseBody getBody() {
        return this.body;
    }

}
