// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCardInfoResponseBody body;

    public static QueryCardInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardInfoResponse self = new QueryCardInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardInfoResponse setBody(QueryCardInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardInfoResponseBody getBody() {
        return this.body;
    }

}
