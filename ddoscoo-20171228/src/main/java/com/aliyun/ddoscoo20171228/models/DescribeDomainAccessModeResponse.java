// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainAccessModeResponseBody body;

    public static DescribeDomainAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAccessModeResponse self = new DescribeDomainAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAccessModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainAccessModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainAccessModeResponse setBody(DescribeDomainAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAccessModeResponseBody getBody() {
        return this.body;
    }

}
