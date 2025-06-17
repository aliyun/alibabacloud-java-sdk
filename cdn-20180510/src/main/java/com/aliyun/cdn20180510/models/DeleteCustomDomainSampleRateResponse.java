// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCustomDomainSampleRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomDomainSampleRateResponseBody body;

    public static DeleteCustomDomainSampleRateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomDomainSampleRateResponse self = new DeleteCustomDomainSampleRateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomDomainSampleRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomDomainSampleRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomDomainSampleRateResponse setBody(DeleteCustomDomainSampleRateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomDomainSampleRateResponseBody getBody() {
        return this.body;
    }

}
