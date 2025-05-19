// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryProjectMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProjectMetaResponseBody body;

    public static QueryProjectMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectMetaResponse self = new QueryProjectMetaResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProjectMetaResponse setBody(QueryProjectMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectMetaResponseBody getBody() {
        return this.body;
    }

}
