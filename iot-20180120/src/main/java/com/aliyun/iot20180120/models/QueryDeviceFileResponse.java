// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceFileResponseBody body;

    public static QueryDeviceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileResponse self = new QueryDeviceFileResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceFileResponse setBody(QueryDeviceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceFileResponseBody getBody() {
        return this.body;
    }

}
