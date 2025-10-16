// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeClearAuthInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClearAuthInfoResponseBody body;

    public static DescribeClearAuthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClearAuthInfoResponse self = new DescribeClearAuthInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClearAuthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClearAuthInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClearAuthInfoResponse setBody(DescribeClearAuthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClearAuthInfoResponseBody getBody() {
        return this.body;
    }

}
