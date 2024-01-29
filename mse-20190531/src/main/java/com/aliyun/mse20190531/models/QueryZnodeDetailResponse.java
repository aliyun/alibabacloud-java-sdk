// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryZnodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryZnodeDetailResponseBody body;

    public static QueryZnodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryZnodeDetailResponse self = new QueryZnodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryZnodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryZnodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryZnodeDetailResponse setBody(QueryZnodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryZnodeDetailResponseBody getBody() {
        return this.body;
    }

}
