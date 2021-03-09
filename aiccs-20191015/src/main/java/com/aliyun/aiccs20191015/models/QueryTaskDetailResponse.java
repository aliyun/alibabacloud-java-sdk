// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskDetailResponseBody body;

    public static QueryTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailResponse self = new QueryTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskDetailResponse setBody(QueryTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskDetailResponseBody getBody() {
        return this.body;
    }

}
