// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnIpaServiceResponseBody body;

    public static DescribeDcdnIpaServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaServiceResponse self = new DescribeDcdnIpaServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpaServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnIpaServiceResponse setBody(DescribeDcdnIpaServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaServiceResponseBody getBody() {
        return this.body;
    }

}
