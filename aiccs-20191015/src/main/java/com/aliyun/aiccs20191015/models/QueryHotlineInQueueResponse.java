// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineInQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotlineInQueueResponseBody body;

    public static QueryHotlineInQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineInQueueResponse self = new QueryHotlineInQueueResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotlineInQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotlineInQueueResponse setBody(QueryHotlineInQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotlineInQueueResponseBody getBody() {
        return this.body;
    }

}
