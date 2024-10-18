// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryGroupLiveInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGroupLiveInfoResponseBody body;

    public static QueryGroupLiveInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupLiveInfoResponse self = new QueryGroupLiveInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupLiveInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupLiveInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupLiveInfoResponse setBody(QueryGroupLiveInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupLiveInfoResponseBody getBody() {
        return this.body;
    }

}
