// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainUsageDataResponseBody body;

    public static DescribeDomainUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUsageDataResponse self = new DescribeDomainUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainUsageDataResponse setBody(DescribeDomainUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainUsageDataResponseBody getBody() {
        return this.body;
    }

}
