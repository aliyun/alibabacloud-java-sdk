// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamPushJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStreamPushJobResponseBody body;

    public static QueryStreamPushJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamPushJobResponse self = new QueryStreamPushJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryStreamPushJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStreamPushJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStreamPushJobResponse setBody(QueryStreamPushJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStreamPushJobResponseBody getBody() {
        return this.body;
    }

}
