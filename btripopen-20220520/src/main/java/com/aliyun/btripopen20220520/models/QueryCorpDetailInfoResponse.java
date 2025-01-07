// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCorpDetailInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCorpDetailInfoResponseBody body;

    public static QueryCorpDetailInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpDetailInfoResponse self = new QueryCorpDetailInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCorpDetailInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCorpDetailInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCorpDetailInfoResponse setBody(QueryCorpDetailInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCorpDetailInfoResponseBody getBody() {
        return this.body;
    }

}
