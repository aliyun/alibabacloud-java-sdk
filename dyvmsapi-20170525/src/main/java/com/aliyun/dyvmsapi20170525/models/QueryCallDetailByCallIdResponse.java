// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByCallIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCallDetailByCallIdResponseBody body;

    public static QueryCallDetailByCallIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByCallIdResponse self = new QueryCallDetailByCallIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByCallIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallDetailByCallIdResponse setBody(QueryCallDetailByCallIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallDetailByCallIdResponseBody getBody() {
        return this.body;
    }

}
