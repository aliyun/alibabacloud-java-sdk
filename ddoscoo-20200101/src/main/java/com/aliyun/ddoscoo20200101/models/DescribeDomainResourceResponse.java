// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainResourceResponseBody body;

    public static DescribeDomainResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResourceResponse self = new DescribeDomainResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainResourceResponse setBody(DescribeDomainResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainResourceResponseBody getBody() {
        return this.body;
    }

}
