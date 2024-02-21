// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainQpsDataResponseBody body;

    public static DescribeDomainQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataResponse self = new DescribeDomainQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainQpsDataResponse setBody(DescribeDomainQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainQpsDataResponseBody getBody() {
        return this.body;
    }

}
