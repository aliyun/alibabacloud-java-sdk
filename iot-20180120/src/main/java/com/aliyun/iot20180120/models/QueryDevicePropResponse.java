// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicePropResponseBody body;

    public static QueryDevicePropResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropResponse self = new QueryDevicePropResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePropResponse setBody(QueryDevicePropResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePropResponseBody getBody() {
        return this.body;
    }

}
