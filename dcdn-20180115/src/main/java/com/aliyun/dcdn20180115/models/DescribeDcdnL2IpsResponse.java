// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2IpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnL2IpsResponseBody body;

    public static DescribeDcdnL2IpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2IpsResponse self = new DescribeDcdnL2IpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2IpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnL2IpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnL2IpsResponse setBody(DescribeDcdnL2IpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnL2IpsResponseBody getBody() {
        return this.body;
    }

}
