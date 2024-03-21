// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnServiceResponseBody body;

    public static DescribeDcdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnServiceResponse self = new DescribeDcdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnServiceResponse setBody(DescribeDcdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnServiceResponseBody getBody() {
        return this.body;
    }

}
