// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecSpecInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSecSpecInfoResponseBody body;

    public static DescribeDcdnSecSpecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecSpecInfoResponse self = new DescribeDcdnSecSpecInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecSpecInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSecSpecInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSecSpecInfoResponse setBody(DescribeDcdnSecSpecInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSecSpecInfoResponseBody getBody() {
        return this.body;
    }

}
