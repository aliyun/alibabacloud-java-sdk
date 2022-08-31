// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcFlowDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainSrcFlowDataResponseBody body;

    public static DescribeDomainSrcFlowDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcFlowDataResponse self = new DescribeDomainSrcFlowDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcFlowDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSrcFlowDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSrcFlowDataResponse setBody(DescribeDomainSrcFlowDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSrcFlowDataResponseBody getBody() {
        return this.body;
    }

}
