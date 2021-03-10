// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceResponseBody body;

    public static QueryDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceResponse self = new QueryDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceResponse setBody(QueryDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceResponseBody getBody() {
        return this.body;
    }

}
