// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Query400RealNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Query400RealNameListResponseBody body;

    public static Query400RealNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        Query400RealNameListResponse self = new Query400RealNameListResponse();
        return TeaModel.build(map, self);
    }

    public Query400RealNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Query400RealNameListResponse setBody(Query400RealNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public Query400RealNameListResponseBody getBody() {
        return this.body;
    }

}
