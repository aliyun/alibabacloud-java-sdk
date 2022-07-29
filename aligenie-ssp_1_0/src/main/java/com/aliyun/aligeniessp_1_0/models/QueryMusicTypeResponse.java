// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryMusicTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMusicTypeResponseBody body;

    public static QueryMusicTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMusicTypeResponse self = new QueryMusicTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMusicTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMusicTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMusicTypeResponse setBody(QueryMusicTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMusicTypeResponseBody getBody() {
        return this.body;
    }

}
