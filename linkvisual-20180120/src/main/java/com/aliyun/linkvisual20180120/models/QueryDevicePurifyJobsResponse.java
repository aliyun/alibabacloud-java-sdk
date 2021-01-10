// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicePurifyJobsResponseBody body;

    public static QueryDevicePurifyJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyJobsResponse self = new QueryDevicePurifyJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePurifyJobsResponse setBody(QueryDevicePurifyJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePurifyJobsResponseBody getBody() {
        return this.body;
    }

}
