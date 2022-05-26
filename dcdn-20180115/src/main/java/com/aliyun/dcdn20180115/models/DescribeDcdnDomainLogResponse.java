// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainLogResponseBody body;

    public static DescribeDcdnDomainLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainLogResponse self = new DescribeDcdnDomainLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainLogResponse setBody(DescribeDcdnDomainLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainLogResponseBody getBody() {
        return this.body;
    }

}
