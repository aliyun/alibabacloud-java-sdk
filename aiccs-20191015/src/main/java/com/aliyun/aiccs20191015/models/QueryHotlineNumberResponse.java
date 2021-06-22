// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotlineNumberResponseBody body;

    public static QueryHotlineNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineNumberResponse self = new QueryHotlineNumberResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotlineNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotlineNumberResponse setBody(QueryHotlineNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotlineNumberResponseBody getBody() {
        return this.body;
    }

}
