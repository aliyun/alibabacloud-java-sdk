// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class QueryEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEntityResponseBody body;

    public static QueryEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEntityResponse self = new QueryEntityResponse();
        return TeaModel.build(map, self);
    }

    public QueryEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEntityResponse setBody(QueryEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEntityResponseBody getBody() {
        return this.body;
    }

}
