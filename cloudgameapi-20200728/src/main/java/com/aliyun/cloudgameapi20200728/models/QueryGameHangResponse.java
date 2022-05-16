// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryGameHangResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGameHangResponseBody body;

    public static QueryGameHangResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGameHangResponse self = new QueryGameHangResponse();
        return TeaModel.build(map, self);
    }

    public QueryGameHangResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGameHangResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGameHangResponse setBody(QueryGameHangResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGameHangResponseBody getBody() {
        return this.body;
    }

}
