// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafSpecInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafSpecInfoResponseBody body;

    public static DescribeDcdnWafSpecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafSpecInfoResponse self = new DescribeDcdnWafSpecInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafSpecInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafSpecInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafSpecInfoResponse setBody(DescribeDcdnWafSpecInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafSpecInfoResponseBody getBody() {
        return this.body;
    }

}
