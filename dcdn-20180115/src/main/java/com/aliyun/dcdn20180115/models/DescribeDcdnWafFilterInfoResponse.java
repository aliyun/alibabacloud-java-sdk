// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafFilterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafFilterInfoResponseBody body;

    public static DescribeDcdnWafFilterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafFilterInfoResponse self = new DescribeDcdnWafFilterInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafFilterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafFilterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafFilterInfoResponse setBody(DescribeDcdnWafFilterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafFilterInfoResponseBody getBody() {
        return this.body;
    }

}
