// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSaasTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSaasTaskListResponseBody body;

    public static QuerySmsSaasTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSaasTaskListResponse self = new QuerySmsSaasTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSaasTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSaasTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSaasTaskListResponse setBody(QuerySmsSaasTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSaasTaskListResponseBody getBody() {
        return this.body;
    }

}
