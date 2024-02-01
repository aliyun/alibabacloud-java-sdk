// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamPushJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStreamPushJobListResponseBody body;

    public static QueryStreamPushJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamPushJobListResponse self = new QueryStreamPushJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStreamPushJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStreamPushJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStreamPushJobListResponse setBody(QueryStreamPushJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStreamPushJobListResponseBody getBody() {
        return this.body;
    }

}
