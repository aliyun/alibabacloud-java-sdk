// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeDomainISPDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainISPDataResponseBody body;

    public static DescribeDomainISPDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainISPDataResponse self = new DescribeDomainISPDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainISPDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainISPDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainISPDataResponse setBody(DescribeDomainISPDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainISPDataResponseBody getBody() {
        return this.body;
    }

}
