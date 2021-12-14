// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryUsagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUsagesResponseBody body;

    public static QueryUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUsagesResponse self = new QueryUsagesResponse();
        return TeaModel.build(map, self);
    }

    public QueryUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUsagesResponse setBody(QueryUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUsagesResponseBody getBody() {
        return this.body;
    }

}
