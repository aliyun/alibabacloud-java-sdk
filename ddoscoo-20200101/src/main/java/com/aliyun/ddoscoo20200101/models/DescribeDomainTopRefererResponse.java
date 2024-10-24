// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopRefererResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTopRefererResponseBody body;

    public static DescribeDomainTopRefererResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopRefererResponse self = new DescribeDomainTopRefererResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopRefererResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopRefererResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTopRefererResponse setBody(DescribeDomainTopRefererResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopRefererResponseBody getBody() {
        return this.body;
    }

}
