// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmarttagJobResponseBody body;

    public static QuerySmarttagJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagJobResponse self = new QuerySmarttagJobResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmarttagJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmarttagJobResponse setBody(QuerySmarttagJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmarttagJobResponseBody getBody() {
        return this.body;
    }

}
