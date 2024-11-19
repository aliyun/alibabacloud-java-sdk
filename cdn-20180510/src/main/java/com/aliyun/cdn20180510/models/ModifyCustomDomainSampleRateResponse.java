// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCustomDomainSampleRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomDomainSampleRateResponseBody body;

    public static ModifyCustomDomainSampleRateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomDomainSampleRateResponse self = new ModifyCustomDomainSampleRateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomDomainSampleRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomDomainSampleRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomDomainSampleRateResponse setBody(ModifyCustomDomainSampleRateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomDomainSampleRateResponseBody getBody() {
        return this.body;
    }

}
