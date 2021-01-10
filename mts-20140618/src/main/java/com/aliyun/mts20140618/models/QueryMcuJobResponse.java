// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMcuJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMcuJobResponseBody body;

    public static QueryMcuJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcuJobResponse self = new QueryMcuJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcuJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcuJobResponse setBody(QueryMcuJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcuJobResponseBody getBody() {
        return this.body;
    }

}
