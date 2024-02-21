// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainVerifyDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainVerifyDataResponseBody body;

    public static DescribeDomainVerifyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainVerifyDataResponse self = new DescribeDomainVerifyDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainVerifyDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainVerifyDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainVerifyDataResponse setBody(DescribeDomainVerifyDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainVerifyDataResponseBody getBody() {
        return this.body;
    }

}
