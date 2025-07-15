// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveIpInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveIpInfoResponseBody body;

    public static DescribeLiveIpInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveIpInfoResponse self = new DescribeLiveIpInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveIpInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveIpInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveIpInfoResponse setBody(DescribeLiveIpInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveIpInfoResponseBody getBody() {
        return this.body;
    }

}
