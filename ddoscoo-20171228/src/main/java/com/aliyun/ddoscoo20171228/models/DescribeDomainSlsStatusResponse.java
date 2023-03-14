// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainSlsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainSlsStatusResponseBody body;

    public static DescribeDomainSlsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSlsStatusResponse self = new DescribeDomainSlsStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSlsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSlsStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSlsStatusResponse setBody(DescribeDomainSlsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSlsStatusResponseBody getBody() {
        return this.body;
    }

}
