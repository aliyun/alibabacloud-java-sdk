// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class QueryPrepublishPassedDeviceCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPrepublishPassedDeviceCountResponseBody body;

    public static QueryPrepublishPassedDeviceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepublishPassedDeviceCountResponse self = new QueryPrepublishPassedDeviceCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryPrepublishPassedDeviceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPrepublishPassedDeviceCountResponse setBody(QueryPrepublishPassedDeviceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPrepublishPassedDeviceCountResponseBody getBody() {
        return this.body;
    }

}
