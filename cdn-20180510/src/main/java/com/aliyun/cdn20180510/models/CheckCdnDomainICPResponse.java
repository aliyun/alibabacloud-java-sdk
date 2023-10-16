// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CheckCdnDomainICPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCdnDomainICPResponseBody body;

    public static CheckCdnDomainICPResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCdnDomainICPResponse self = new CheckCdnDomainICPResponse();
        return TeaModel.build(map, self);
    }

    public CheckCdnDomainICPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCdnDomainICPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCdnDomainICPResponse setBody(CheckCdnDomainICPResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCdnDomainICPResponseBody getBody() {
        return this.body;
    }

}
