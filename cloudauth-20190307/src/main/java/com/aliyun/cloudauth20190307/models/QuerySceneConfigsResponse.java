// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QuerySceneConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySceneConfigsResponseBody body;

    public static QuerySceneConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneConfigsResponse self = new QuerySceneConfigsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySceneConfigsResponse setBody(QuerySceneConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneConfigsResponseBody getBody() {
        return this.body;
    }

}
