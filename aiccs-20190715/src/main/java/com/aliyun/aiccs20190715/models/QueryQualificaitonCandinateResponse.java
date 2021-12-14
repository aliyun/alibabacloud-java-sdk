// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryQualificaitonCandinateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryQualificaitonCandinateResponseBody body;

    public static QueryQualificaitonCandinateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificaitonCandinateResponse self = new QueryQualificaitonCandinateResponse();
        return TeaModel.build(map, self);
    }

    public QueryQualificaitonCandinateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQualificaitonCandinateResponse setBody(QueryQualificaitonCandinateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQualificaitonCandinateResponseBody getBody() {
        return this.body;
    }

}
