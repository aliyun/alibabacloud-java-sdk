// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubServiceNodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyKubServiceNodeDetailResponseBody body;

    public static QueryTopologyKubServiceNodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubServiceNodeDetailResponse self = new QueryTopologyKubServiceNodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubServiceNodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyKubServiceNodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyKubServiceNodeDetailResponse setBody(QueryTopologyKubServiceNodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyKubServiceNodeDetailResponseBody getBody() {
        return this.body;
    }

}
