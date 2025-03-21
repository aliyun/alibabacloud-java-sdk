// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBatchRegistAnonymousTbAccountResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBatchRegistAnonymousTbAccountResultResponseBody body;

    public static QueryBatchRegistAnonymousTbAccountResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegistAnonymousTbAccountResultResponse self = new QueryBatchRegistAnonymousTbAccountResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setBody(QueryBatchRegistAnonymousTbAccountResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBatchRegistAnonymousTbAccountResultResponseBody getBody() {
        return this.body;
    }

}
