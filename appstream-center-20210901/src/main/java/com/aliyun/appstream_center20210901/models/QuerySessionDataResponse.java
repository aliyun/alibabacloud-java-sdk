// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QuerySessionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySessionDataResponseBody body;

    public static QuerySessionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionDataResponse self = new QuerySessionDataResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySessionDataResponse setBody(QuerySessionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionDataResponseBody getBody() {
        return this.body;
    }

}
