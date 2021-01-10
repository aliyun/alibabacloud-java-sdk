// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceEventResponseBody body;

    public static QueryDeviceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventResponse self = new QueryDeviceEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceEventResponse setBody(QueryDeviceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceEventResponseBody getBody() {
        return this.body;
    }

}
