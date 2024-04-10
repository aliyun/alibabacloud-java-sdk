// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryWabaBusinessInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWabaBusinessInfoResponseBody body;

    public static QueryWabaBusinessInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWabaBusinessInfoResponse self = new QueryWabaBusinessInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryWabaBusinessInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWabaBusinessInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWabaBusinessInfoResponse setBody(QueryWabaBusinessInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWabaBusinessInfoResponseBody getBody() {
        return this.body;
    }

}
