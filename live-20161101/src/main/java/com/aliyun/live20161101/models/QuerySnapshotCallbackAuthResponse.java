// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QuerySnapshotCallbackAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySnapshotCallbackAuthResponseBody body;

    public static QuerySnapshotCallbackAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySnapshotCallbackAuthResponse self = new QuerySnapshotCallbackAuthResponse();
        return TeaModel.build(map, self);
    }

    public QuerySnapshotCallbackAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySnapshotCallbackAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySnapshotCallbackAuthResponse setBody(QuerySnapshotCallbackAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySnapshotCallbackAuthResponseBody getBody() {
        return this.body;
    }

}
