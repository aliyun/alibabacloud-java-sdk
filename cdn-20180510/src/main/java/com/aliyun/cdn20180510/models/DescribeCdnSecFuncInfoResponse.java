// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSecFuncInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnSecFuncInfoResponseBody body;

    public static DescribeCdnSecFuncInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSecFuncInfoResponse self = new DescribeCdnSecFuncInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSecFuncInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnSecFuncInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnSecFuncInfoResponse setBody(DescribeCdnSecFuncInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnSecFuncInfoResponseBody getBody() {
        return this.body;
    }

}
