// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryAccountLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountLabelResponseBody body;

    public static QueryAccountLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountLabelResponse self = new QueryAccountLabelResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountLabelResponse setBody(QueryAccountLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountLabelResponseBody getBody() {
        return this.body;
    }

}
