// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class QueryHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHostResponseBody body;

    public static QueryHostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHostResponse self = new QueryHostResponse();
        return TeaModel.build(map, self);
    }

    public QueryHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHostResponse setBody(QueryHostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHostResponseBody getBody() {
        return this.body;
    }

}
