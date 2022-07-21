// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskDetailListResponseBody body;

    public static QueryTaskDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailListResponse self = new QueryTaskDetailListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskDetailListResponse setBody(QueryTaskDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskDetailListResponseBody getBody() {
        return this.body;
    }

}
