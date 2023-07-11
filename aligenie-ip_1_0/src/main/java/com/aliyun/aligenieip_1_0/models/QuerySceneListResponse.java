// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QuerySceneListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneListResponseBody body;

    public static QuerySceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneListResponse self = new QuerySceneListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneListResponse setBody(QuerySceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneListResponseBody getBody() {
        return this.body;
    }

}
