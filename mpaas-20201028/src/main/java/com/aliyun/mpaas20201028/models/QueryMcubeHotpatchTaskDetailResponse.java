// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeHotpatchTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMcubeHotpatchTaskDetailResponseBody body;

    public static QueryMcubeHotpatchTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeHotpatchTaskDetailResponse self = new QueryMcubeHotpatchTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcubeHotpatchTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcubeHotpatchTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMcubeHotpatchTaskDetailResponse setBody(QueryMcubeHotpatchTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcubeHotpatchTaskDetailResponseBody getBody() {
        return this.body;
    }

}
