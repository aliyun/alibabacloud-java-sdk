// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecFuncInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSecFuncInfoResponseBody body;

    public static DescribeDcdnSecFuncInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecFuncInfoResponse self = new DescribeDcdnSecFuncInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecFuncInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSecFuncInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSecFuncInfoResponse setBody(DescribeDcdnSecFuncInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSecFuncInfoResponseBody getBody() {
        return this.body;
    }

}
