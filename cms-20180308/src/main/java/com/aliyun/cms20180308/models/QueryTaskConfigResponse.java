// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskConfigResponseBody body;

    public static QueryTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskConfigResponse self = new QueryTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskConfigResponse setBody(QueryTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskConfigResponseBody getBody() {
        return this.body;
    }

}
