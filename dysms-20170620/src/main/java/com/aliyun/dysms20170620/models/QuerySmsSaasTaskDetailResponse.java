// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSaasTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSaasTaskDetailResponseBody body;

    public static QuerySmsSaasTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSaasTaskDetailResponse self = new QuerySmsSaasTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSaasTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSaasTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSaasTaskDetailResponse setBody(QuerySmsSaasTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSaasTaskDetailResponseBody getBody() {
        return this.body;
    }

}
