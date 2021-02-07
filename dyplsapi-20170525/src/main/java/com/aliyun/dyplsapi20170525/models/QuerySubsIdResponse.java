// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubsIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySubsIdResponseBody body;

    public static QuerySubsIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubsIdResponse self = new QuerySubsIdResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubsIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySubsIdResponse setBody(QuerySubsIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySubsIdResponseBody getBody() {
        return this.body;
    }

}
