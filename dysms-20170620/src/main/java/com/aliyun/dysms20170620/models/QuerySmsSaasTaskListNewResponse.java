// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSaasTaskListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSaasTaskListNewResponseBody body;

    public static QuerySmsSaasTaskListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSaasTaskListNewResponse self = new QuerySmsSaasTaskListNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSaasTaskListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSaasTaskListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSaasTaskListNewResponse setBody(QuerySmsSaasTaskListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSaasTaskListNewResponseBody getBody() {
        return this.body;
    }

}
