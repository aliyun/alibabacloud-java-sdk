// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopHttpMethodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTopHttpMethodResponseBody body;

    public static DescribeDomainTopHttpMethodResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopHttpMethodResponse self = new DescribeDomainTopHttpMethodResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopHttpMethodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopHttpMethodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTopHttpMethodResponse setBody(DescribeDomainTopHttpMethodResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopHttpMethodResponseBody getBody() {
        return this.body;
    }

}
