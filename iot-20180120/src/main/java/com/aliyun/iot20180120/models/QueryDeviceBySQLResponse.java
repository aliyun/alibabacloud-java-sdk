// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceBySQLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceBySQLResponseBody body;

    public static QueryDeviceBySQLResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceBySQLResponse self = new QueryDeviceBySQLResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceBySQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceBySQLResponse setBody(QueryDeviceBySQLResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceBySQLResponseBody getBody() {
        return this.body;
    }

}
