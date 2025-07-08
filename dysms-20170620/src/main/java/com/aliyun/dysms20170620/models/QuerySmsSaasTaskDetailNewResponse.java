// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSaasTaskDetailNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSaasTaskDetailNewResponseBody body;

    public static QuerySmsSaasTaskDetailNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSaasTaskDetailNewResponse self = new QuerySmsSaasTaskDetailNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSaasTaskDetailNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSaasTaskDetailNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSaasTaskDetailNewResponse setBody(QuerySmsSaasTaskDetailNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSaasTaskDetailNewResponseBody getBody() {
        return this.body;
    }

}
