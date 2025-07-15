// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullToPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePullToPushResponseBody body;

    public static DescribeLivePullToPushResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullToPushResponse self = new DescribeLivePullToPushResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullToPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePullToPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePullToPushResponse setBody(DescribeLivePullToPushResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePullToPushResponseBody getBody() {
        return this.body;
    }

}
