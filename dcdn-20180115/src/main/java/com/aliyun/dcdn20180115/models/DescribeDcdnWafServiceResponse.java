// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafServiceResponseBody body;

    public static DescribeDcdnWafServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafServiceResponse self = new DescribeDcdnWafServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafServiceResponse setBody(DescribeDcdnWafServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafServiceResponseBody getBody() {
        return this.body;
    }

}
