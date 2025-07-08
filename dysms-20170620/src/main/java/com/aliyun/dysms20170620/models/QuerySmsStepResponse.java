// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStepResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsStepResponseBody body;

    public static QuerySmsStepResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStepResponse self = new QuerySmsStepResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsStepResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsStepResponse setBody(QuerySmsStepResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStepResponseBody getBody() {
        return this.body;
    }

}
