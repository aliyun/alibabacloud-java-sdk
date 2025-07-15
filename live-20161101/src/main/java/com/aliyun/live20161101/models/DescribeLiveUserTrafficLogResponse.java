// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserTrafficLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveUserTrafficLogResponseBody body;

    public static DescribeLiveUserTrafficLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserTrafficLogResponse self = new DescribeLiveUserTrafficLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserTrafficLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveUserTrafficLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveUserTrafficLogResponse setBody(DescribeLiveUserTrafficLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveUserTrafficLogResponseBody getBody() {
        return this.body;
    }

}
