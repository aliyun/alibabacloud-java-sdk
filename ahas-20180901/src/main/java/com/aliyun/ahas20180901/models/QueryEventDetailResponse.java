// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEventDetailResponseBody body;

    public static QueryEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventDetailResponse self = new QueryEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventDetailResponse setBody(QueryEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventDetailResponseBody getBody() {
        return this.body;
    }

}
