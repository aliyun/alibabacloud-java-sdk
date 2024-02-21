// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSrcQpsDataResponseBody body;

    public static DescribeDomainSrcQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcQpsDataResponse self = new DescribeDomainSrcQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSrcQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSrcQpsDataResponse setBody(DescribeDomainSrcQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSrcQpsDataResponseBody getBody() {
        return this.body;
    }

}
