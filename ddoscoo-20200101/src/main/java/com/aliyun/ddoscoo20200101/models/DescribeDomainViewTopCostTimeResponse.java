// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopCostTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainViewTopCostTimeResponseBody body;

    public static DescribeDomainViewTopCostTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopCostTimeResponse self = new DescribeDomainViewTopCostTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopCostTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainViewTopCostTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainViewTopCostTimeResponse setBody(DescribeDomainViewTopCostTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainViewTopCostTimeResponseBody getBody() {
        return this.body;
    }

}
