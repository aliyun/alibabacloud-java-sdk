// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyNodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyNodeDetailResponseBody body;

    public static QueryTopologyNodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyNodeDetailResponse self = new QueryTopologyNodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyNodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyNodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyNodeDetailResponse setBody(QueryTopologyNodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyNodeDetailResponseBody getBody() {
        return this.body;
    }

}
